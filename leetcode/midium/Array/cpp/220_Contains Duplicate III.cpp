class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
        
        vector<pair<int, int>> ans;
        for(int i = 0; i < nums.size(); i++){
            ans.push_back({nums[i], i});
        }
        
        int n = ans.size();
        sort(ans.begin(), ans.end());
        for(int i = 0; i < n; i++){
            
            for(int j = i+1; j < n; j++){
                
                if(abs((long)ans[i].first - (long)ans[j].first) <= t){
                    
                    if(abs(ans[i].second - ans[j].second) <= k){
                        return true;
                    }
                }
                else{
                    break;
                }
            }
        }
        
        return false;
    }
};