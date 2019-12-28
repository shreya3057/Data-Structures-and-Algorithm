
import java.util.*;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
		
public class GFG2
{
    Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
	  
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
			int n = sc.nextInt();
            GFG2 llist1 = new GFG2(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist1.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist1.addToTheLast(new Node(a));
			}
		    llist1.head= head;
			a1=sc.nextInt();
		    GFG obj=new GFG();
			Node start=obj.sortedInsert(llist1.head,a1);
		    llist1.printList(start);
		}
	}

}
/*This is a function problem.You only need to complete the function given below*/
/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
//sortedInsert method should return the head of the modified linked list.
class GFG
{
	Node sortedInsert(Node head1,int key)
	{
	    Node newnode=new Node(key);
	   if(head1==null || head1.data>=key)
	   {
	       
	       newnode.next=head1;
	       head1=newnode;
	   }
	  
	   else
	   {
	       Node temp=head1;
	       while(temp.next!=null && temp.next.data<key)
	       {
	           temp=temp.next;
	       }
	       newnode.next=temp.next;
	       temp.next=newnode;
	       
	   }
	   return head1;
	}
}