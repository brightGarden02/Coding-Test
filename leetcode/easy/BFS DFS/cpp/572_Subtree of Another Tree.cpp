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
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        
        if(!root){
            
             return false;
            
         }   
         else if(isSametree(root, subRoot)){
             
             return true;
             
         }
         else{
             
             return isSubtree(root->left, subRoot) || isSubtree(root->right, subRoot);
             
         }
    }
    
    bool isSametree(TreeNode* root, TreeNode* subRoot){
        
       if(!root || !subRoot){
   
           return root==NULL && subRoot==NULL;
           
       } 
       else if(root->val == subRoot->val){
           
           return isSametree(root->left, subRoot->left) && isSametree(root->right, subRoot->right);
           
       }
       else{
           
           return false;
           
       }
        
    }
};