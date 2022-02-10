/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* head = nullptr;
    void flatten(TreeNode* root) {
        
        if(root) makeLinkedList(root);
    
    }
    
    void makeLinkedList(TreeNode* node) {
        
        if (node->right) makeLinkedList(node->right);
        if (node->left) makeLinkedList(node->left);
        node->left = nullptr;
        node->right = head;
        head = node;
    }
};