class Solution {
public:
    vector<vector<int>> ans;
    vector<int> cur;
    int sum;
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        
        sort(candidates.begin(), candidates.end());
        combination(candidates, target, 0);
        
        return ans;
    }
    
    void combination(vector<int>& candidates, int target, int starti){
        
        if(sum > target) return;
        if(sum == target){
            ans.push_back(cur);
            return;
        }
            
        for(int i = starti; i < candidates.size(); i++){
            if(i != starti && candidates[i-1] == candidates[i])    
                continue;
            
            sum += candidates[i];
            cur.push_back(candidates[i]);
            
            combination(candidates, target, i+1);
            
            sum -= candidates[i];
            cur.pop_back();
        }
    }
};
