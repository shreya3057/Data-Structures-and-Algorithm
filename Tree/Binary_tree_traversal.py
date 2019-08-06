# Program to traverse a Binary tree
#create a new node
class node:
    #constructor to create a new node
    def __init__(self, data):
        self.data=data
        self.left=None
        self.right=None
#Preorder Tree Traversal
# def Preorder(root)

#Driver code
if __name__=='__main__':
    root=node(4)
    root.left=node(5)
    root.right=node(6)
    print(root)
