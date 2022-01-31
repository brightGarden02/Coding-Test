class Solution {
public:
    vector<vector<int>> ans;
    vector<vector<int>> combinationSum3(int k, int n) {
        
        vector<int> cur;
        combination(cur, 1, k, n);
    
        return ans;
    }
    
    void combination(vector<int>& cur, int starti, int k, int n){
        
        if(n < 0 || cur.size() > k) return;
        if(n == 0 && cur.size() == k){
            ans.push_back(cur);  
            return;
        } 
        
        for(int i = starti; i <= 9; i++){
            
            cur.push_back(i);
            
            combination(cur, i+1, k, n-i);
            
            cur.pop_back();
        }
    }
};