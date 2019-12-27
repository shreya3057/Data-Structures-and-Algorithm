import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null; 
    }
}

public class DeleteMiddle
{
    Node head;  // head of lisl
  
    /* Linked list Node*/
   
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
     public void addToTheLast(Node node) {

  if (head == null) {
   head = node;
  } else {
   Node temp = head;
   while (temp.next != null)
    temp = temp.next;

   temp.next = node;
  }
 }
  /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			DeleteMiddle llist = new DeleteMiddle();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
          
         
		llist.head = new GFG().Delete(llist.head);
        
		llist.printList();
		
			t--;
		}
	}
}/*This is a function problem.You only need to complete the function given below*/
/* class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}*/
class GFG
{
   Node Delete(Node head)
   {
	   // This is method only submission.
           // You only need to complete the method.
          Node temp= head;
          int count=0;
          while (temp != null)
          {
              count++;
              temp=temp.next;
          }
          Node temp1 = head;
          Node temp2 = head;
          if(count==2)
          {
              head.next=null;
              return(head);
          }
          for (int i=0; i < (count/2)-1; i++)
          {
              temp1=temp1.next;
              temp2=temp1.next;
          }
          temp1.next=temp2.next;
          return (head);
   }
}