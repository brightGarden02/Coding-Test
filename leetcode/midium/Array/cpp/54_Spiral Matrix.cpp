class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        int left = 0;
        int right = matrix[0].size()-1;
        int top = 0;
        int bottom = matrix.size()-1;
        
        vector<int> ans;
        int i;
        while(left <= right and top <= bottom) {
            
            for(i = left; i <= right; i++) {
                ans.push_back(matrix[top][i]);
            }
            top++;
            
            
            for(i = top; i <= bottom; i++) {
                ans.push_back(matrix[i][right]);
            }
            right--;
            
            
            if(left > right || top > bottom) break;
            
            
            for(i = right; i >= left; i--) {
                ans.push_back(matrix[bottom][i]);
            }
            bottom--;
            
            
            for(i = bottom; i >= top; i--) {
                ans.push_back(matrix[i][left]);
            }
            left++;
            
        }
        
        return ans;
    }
};