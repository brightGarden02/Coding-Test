class Solution {
public:
    vector<vector<int>> ans;
    vector<int> cur;
    int sum;
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        
            sum = 0; 
            combination(candidates, target, 0);
        
            return ans;
    }
    
    void combination(vector<int>& candidates, int target, int starti){
    
        if(sum > target) return;
        if(sum == target) ans.push_back(cur);
        
        for(int i = starti; i < candidates.size(); i++){
            
            sum += candidates[i];
            cur.push_back(candidates[i]);
            
            combination(candidates, target, i);
            
            sum -= candidates[i];
            cur.pop_back();
        }      
    }
};
