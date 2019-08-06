#Node Creation
class BinaryTreeNode:
    #Constructor to create a new node
    def __init__(self,data):
        self.data=data
        self.left=self.right=None
def PreOrder(root):
    if(root):
        print(root.data,end=" ")
        PreOrder(root.left)
        PreOrder(root.right)
print()

#Main Function
def main():
    root=BinaryTreeNode(1)
    root.left=BinaryTreeNode(2)
    root.right=BinaryTreeNode(3)
    root.left.left=BinaryTreeNode(4)
    root.left.right=BinaryTreeNode(5)
    root.right.left=BinaryTreeNode(6)
    root.right.right=BinaryTreeNode(7)

    PreOrder(root)
#Driver Code
if __name__=='__main__':
    main()