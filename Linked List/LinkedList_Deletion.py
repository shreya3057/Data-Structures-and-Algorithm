class node:
    def __init__(self,data):
        self.data=data
        self.next=None
class LinkedList:
    def __init__(self):
        self.head=None

    def delete(self,position):
        k=1
        if (self.head==None):
            print("List is empty")
            return
        temp=self.head
        if (position==1):
            self.head=self.head.next
            return
        else:
            while(temp!=None and k<position):
                k=k+1
                temp2=temp
                temp=temp.next
            if (temp==None):
                print("Postion does not exist")
            else:
                temp2.next=temp.next
    def view(self):
        temp=self.head
        if(self.head==None):
            print("List is empty")
        else:
            while(temp != None ):
                print(temp.data,end=" ")
                temp=temp.next
if __name__=="__main__":
    list=LinkedList()
    list.head=node("1")
    second=node("2")
    third=node("3")
    fourth=node("4")
    list.head.next=second
    second.next=third
    third.next=fourth
    print("Linked List:")
    list.view()
    print("\n")
    list.delete(3)
    list.view()
    print("\n")
                
        
