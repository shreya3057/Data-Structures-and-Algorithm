//The idea is to do iterative level order traversal of the given tree using queue. 
//If we find a node whose left child is empty, we make new key as left child of the node. 
//Else if we find a node whose right child is empty, we make new key as right child. 
//We keep traversing the tree until we find a node whose either left or right is empty.

void insert(Node * temp,int key)
{
	queue<Node*> q;
	q.push(temp);
	while(! q.empty())
	{
		Node *temp=q.front();
		q.pop();
		if(temp->left == NULL)
		{
			temp->left=new Node(key);
			break;
		}
		else
			q.push(temp->left);
		if(temp->right == NULL)
		{
			temp->right=new Node(key);
			break;
		}
		else
			q.push(temp->right);
	}
}
