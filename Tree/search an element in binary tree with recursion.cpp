bool ifNodeExists(struct Node* node, int key) 
{ 
    if (node == NULL) 
        return false; 
  
    if (node->data == key) 
        return true; 
  
    /* then recur on left sutree */
    bool res1 = ifNodeExists(node->left, key); 
  
    if(res1) return true; // node found, no need to look further 
  
    /* node is not found in left, so recur on right subtree */
    bool res2 = ifNodeExists(node->right, key); 
  
    return res2; 
} 
