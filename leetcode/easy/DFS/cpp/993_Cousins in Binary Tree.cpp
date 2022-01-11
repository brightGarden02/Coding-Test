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
    bool isCousins(TreeNode* root, int x, int y) {
        
        queue<TreeNode*> q;
        q.push(root);

        while(!q.empty()){
            
            int n = q.size();
            bool found1 = false, found2 = false;
            for(int i = 0; i < n; i++){
                
                auto tmp = q.front();
                q.pop();
                
                if(tmp->val == x) found1 = true;
                if(tmp->val == y) found2 = true;
                
                if(tmp->left && tmp->right){
                    if((tmp->left->val == x && tmp->right->val == y) ||
                       (tmp->left->val == y && tmp->right->val == x))
                        return false;
                }
                
                if(tmp->left)
                    q.push(tmp->left);
                if(tmp->right)
                    q.push(tmp->right);
            }
          
            if(found1 && found2)
                return true;
        }
        
        return false;
    }
};