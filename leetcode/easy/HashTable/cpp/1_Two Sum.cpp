class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
    
        vector<int> ans;
        unordered_map<int, int> mp;
        for(int i = 0; i < nums.size(); i++)
        {
            if(mp.find(target - nums[i]) != mp.end())
            {
                ans.emplace_back(mp[target - nums[i]]);
                ans.emplace_back(i);
            }
            else
                mp[nums[i]] = i;
        }
        
       return ans;
    }     
};