class Solution {
public:
    vector<vector<int>> ans;
    vector<int> cur;
    int sum;

    void function(vector<int>& candidates, int t, int index){
    
        if(sum > t) return;

        if(sum == t){
            ans.push_back(cur);
        }
        
        for(int i = index; i < candidates.size(); i++){

            cur.push_back(candidates[i]);
            sum += candidates[i];
            
            function(candidates, t, i);
            
            sum -= candidates[i];
            cur.pop_back();  
        }      
    }

    vector<vector<int>> combinationSum(vector<int>& candidates, int t) {
            sum = 0; 
            function(candidates, t, 0);

            return ans;
    }
};