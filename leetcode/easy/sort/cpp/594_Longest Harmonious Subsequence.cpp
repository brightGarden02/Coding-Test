class Solution {
public:
    int findLHS(vector<int>& nums) {
        
        unordered_map<int, int> mp;
        int ans = 0;
        for(int i = 0; i < nums.size(); i++){
            mp[nums[i]]++;
        }
        
        for(int i = 0; i < nums.size(); i++){
            if(mp[nums[i]] != 0 && mp[nums[i] + 1] != 0)
                ans =  max(ans, mp[nums[i]] + mp[nums[i] + 1]);
        }
    
        return ans;
    }
};