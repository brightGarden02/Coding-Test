class Solution {
public:
    bool mergeTriplets(vector<vector<int>>& triplets, vector<int>& target) {
        
        vector<int> ans(3);
        for (auto &t : triplets)
        if(t[0] <= target[0] && t[1] <= target[1] && t[2] <= target[2]){
            
            ans = { max(ans[0], t[0]), max(ans[1], t[1]), max(ans[2], t[2]) };   
            
        }
            
        return ans == target;  
    }
};