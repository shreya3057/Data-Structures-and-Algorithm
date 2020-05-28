Node* deepest_node(Node* root)
{
	if(root == NULL) return;
	queue<Node*> q;
	q.push(root);
	while(! q.empty())
	{
		Node* temp=q.front();
		q.pop();
		if(temp->left)
			q.push(temp->left);
		if(temp->right)
			q.push(temp->right);
	
	}
	return temp;
}
