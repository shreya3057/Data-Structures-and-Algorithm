
import java.util.*;
import java.lang.*;
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class Swap
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
          
            GfG gfg = new GfG();
            head = gfg.pairwiseSwap(head);
            printList(head);
            System.out.println();
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next !=  null)
              temp = temp.next;
              temp.next = node;
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}
/*This is a function problem.You only need to complete the function given below*/
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class GfG
{
    public static Node pairwiseSwap(Node node)
    {
        
       // add your code here
       if(node.next==null)
       {
           return node;
       }
       else
       {
       Node temp1=null,temp2=null,current=node;
       while(current!=null && current.next!=null)
       
       {
           
           if(temp1!=null)
           {
               temp1.next.next=current.next;
           }
           temp1=current.next;
           current.next=current.next.next;
           temp1.next=current;
           if(temp2==null)
           {
               temp2=temp1;
           }
           current=current.next;
           
       }
       return temp2;
       }
    }
    
   
}