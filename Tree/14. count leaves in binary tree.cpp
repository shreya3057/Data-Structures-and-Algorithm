// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};
Node* newNode(int val)
{
    Node* temp = new Node;
    temp->data = val;
    temp->left = NULL;
    temp->right = NULL;
    
    return temp;
}
Node* buildTree(string str)
{   
    // Corner Case
    if(str.length() == 0 || str[0] == 'N')
            return NULL;
    
    // Creating vector of strings from input 
    // string after spliting by space
    vector<string> ip;
    
    istringstream iss(str);
    for(string str; iss >> str; )
        ip.push_back(str);
        
    // Create the root of the tree
    Node* root = newNode(stoi(ip[0]));
        
    // Push the root to the queue
    queue<Node*> queue;
    queue.push(root);
        
    // Starting from the second element
    int i = 1;
    while(!queue.empty() && i < ip.size()) {
            
        // Get and remove the front of the queue
        Node* currNode = queue.front();
        queue.pop();
            
        // Get the current node's value from the string
        string currVal = ip[i];
            
        // If the left child is not null
        if(currVal != "N") {
                
            // Create the left child for the current node
            currNode->left = newNode(stoi(currVal));
                
            // Push it to the queue
            queue.push(currNode->left);
        }
            
        // For the right child
        i++;
        if(i >= ip.size())
            break;
        currVal = ip[i];
            
        // If the right child is not null
        if(currVal != "N") {
                
            // Create the right child for the current node
            currNode->right = newNode(stoi(currVal));
                
            // Push it to the queue
            queue.push(currNode->right);
        }
        i++;
    }
    
    return root;
}
void deletionBT(struct Node* root, int key);
void inn(Node *node)
{
    if(node==NULL)
        return;
    
    inn(node->left);
    cout<<node->data<<" ";
    inn(node->right);
}

int main()
{
    int t;
	scanf("%d ",&t);
    while(t--)
    {
        int k;
        scanf("%d ",&k);
        string s;
		getline(cin,s);
		Node* root = buildTree(s);
		deletionBT(root,k);
		inn(root);
		cout<<endl;
    }
    return 0;
}
// } Driver Code Ends


/*
Structre of the node of the tree is as
struct Node
{
	int data;
	Node* left, *right;
};
*/
void deletionBT(struct Node* root, int key)
{
    queue<struct Node* >st;
    if(root==NULL)
    return;
    if(root->data ==key && root->left==NULL && root->right==NULL )
    root= NULL;
    st.push(root);
    
    struct Node* temp,*ans=NULL,*temp2;
    int ans2;
    while(!st.empty())
    {
        temp=st.front();
         st.pop();
    if(temp->data==key)
    {
        ans=temp;
    }
    if(temp->left)
    st.push(temp->left);
    if(temp->right)
    st.push(temp->right);
    }
     stack<struct Node* >st1;
     st1.push(root);
    while(!st1.empty())
    {
        temp2=st1.top();
        st1.pop();
        if(temp2->left==temp)
         {
            temp2->left=NULL;
            break;
        }
        else if(temp2->left)
        st1.push(temp2->left);
       if(temp2->right==temp)
        {temp2->right=NULL; break;}
        else if(temp2->right)
        {
            st1.push(temp2->right);
        }
    }
    if(ans!=NULL)
    ans->data=temp->data;
    
    
    
}
