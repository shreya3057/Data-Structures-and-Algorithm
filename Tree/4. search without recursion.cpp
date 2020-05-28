int search(struct Node* root, int key)
{
	Node* temp;
	queue<Node*> q;
	if (root == NULL)
		return 0;
	q.push(root);
	while(!q.empty())
	{
		temp=q.front();
		q.pop();
		if(temp->data == key);
			return 1;
		if(temp->left)
			q.push(temp-> left);
	}
	return 0;
}
