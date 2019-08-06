#class to create a node
class ListNode:
    def __init__(self,data):
        self.data=data
        self.next=None
        return

# LinkedList Class
class LinkedList:
    def __init__(self):
        self.head= None

    #Printing the list
    def listprint(self):
        printval=self.head
        while printval is not None:
            print(printval.data,end=" ")
            printval=printval.next
    #insertion
    def insert_in_linkedlist(self,data,position):
        k=1
        newnode=ListNode(data)
        p=self.head
        # q=self.head
        #Insert at beginning
        if(position==1):
            newnode.next=p
            self.head=newnode
        #Insert at specified position
        while(k<position):
            k=k+1
            q=self.head
            self.head=p.next
        q.next=newnode
        newnode.next=p
    
if __name__=="__main__":
    list=LinkedList()
    list.head=ListNode("1")
    second=ListNode("2")
    third=ListNode("3")
    fourth=ListNode("4")
    list.head.next=second
    second.next=third
    third.next=fourth
    print("Linked List:")
    list.listprint()
    print("\n")
    print("After insertion:")
    list.insert_in_linkedlist(8,1)
    list.listprint()
    print("Specified position")
    list.insert_in_linkedlist(95,3)
    list.listprint()