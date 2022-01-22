class Solution {
public:
    vector<vector<int>> ans;
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        permutation(nums, 0);
        
        return ans;
    }
    
    void permutation(vector<int> nums, int starti) {
        
        if(starti == nums.size()) {
            ans.push_back(nums);
        }
        
        for(int i = starti; i < nums.size(); i++) {
            
            if (i != starti && nums[i] == nums[starti]) continue;
            
            swap(nums[i], nums[starti]);
            permutation(nums, starti + 1);
        }
    }
};