class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        
        vector<int> v;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == target){
                v.push_back(i);
            }
        }
        
        if(v.size() == 0){
            vector<int> ans(2, -1);
            return ans;
        }
        
        vector<int> ans(2, 0);
        ans[0] = v[0];
        ans[1] = v[v.size()-1];
        return ans;
    }
};