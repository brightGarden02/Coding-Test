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
    vector<double> averageOfLevels(TreeNode* root) {
        
        vector<double> v;
        queue<TreeNode*> q;
        q.push(root);
        
        while(q.size()){
        
            double avg = 0;
            int size = q.size();
            for(int i = q.size(); i > 0; i--){
                
                auto curr = q.front();
                q.pop();
                avg += curr->val;
                if(curr->left) q.push(curr->left);
                if(curr->right) q.push(curr->right);
            }  
            v.push_back(avg/size);
        }
        
        return v;
    }
};