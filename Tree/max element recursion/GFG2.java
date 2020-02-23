// { Driver Code Starts
    import java.util.*;
    import java.util.Scanner;
    import java.util.HashMap;
    import java.lang.Math;
        class Node
        {
            int data;
            Node left,right;
            Node(int d) {data = d; left =right= null; }
        }
            
    public class GFG2
    {
        public static void inorder(Node root)
        {
            if(root==null)
            return;
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
         /* Drier program to test above functions */
        public static void main(String args[])
        {
             Scanner sc = new Scanner(System.in);
             int t=sc.nextInt();
             
             while(t-->0)
             {
                int n = sc.nextInt();
                GFG2 llist=new GFG2();
                Node root=null,parent=null;
                HashMap<Integer, Node> m = new HashMap<>();
                for(int i=0;i<n;i++)
                {
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    char c=sc.next().charAt(0);
                    if(m.containsKey(a)==false)
                    {
                        parent=new Node(a);
                        m.put(a,parent);
                        if(root==null)
                        root=parent;
                    }
                    else
                        parent=m.get(a);
                    Node child=new Node(b);
                    if(c=='L')
                    parent.left=child;
                    else
                    parent.right=child;
                    m.put(b,child);
                }
                GFG obj = new GFG();
                int Max=obj.findMax(root);
                int Min=obj.findMin(root);
                System.out.println(Max+" "+Min);
            }
        }
    }// } Driver Code Ends
    /*class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }*/
    
    //Complete the findMax and findMin functions.
    class GFG
    {
        public static int findMax(Node root)
        {
            //Add your code here.
            int root_val,left,right,max=0;
            if(root!=null)
            {
                root_val=root.data;
                left=findMax(root.left);
                right=findMax(root.right);
                if(left>right)
                    max=left;
                else
                    max=right;
                if (max<root_val)
                    max=root_val; 
               
            }
            return max;
        }
        public static int findMin(Node root)
        {
            //Add your code here.
            int root_val,left,right,min=100000;
            if(root!=null)
            {
                root_val=root.data;
                left=findMin(root.left);
                right=findMin(root.right);
                if(left<right)
                    min=left;
                else
                    min=right;
                if (min>root_val)
                    min=root_val;
               
        }
        return min;
    }
    }