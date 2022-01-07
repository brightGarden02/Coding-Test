/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<int> preorder(Node* root) {
        
        vector<int> pre;
        traverse(root, pre);
        return pre;
    }
    
    void traverse(Node* root, vector<int>& pre){
        
        if(root == NULL) return;
        pre.push_back(root->val);
        for(auto x : root->children){
            traverse(x, pre);    
        }
        
    }
};