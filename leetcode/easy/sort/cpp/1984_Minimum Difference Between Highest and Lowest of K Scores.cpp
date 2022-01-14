class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        
        int n = nums.size();
        if(n == 1) return 0;
        
        sort(nums.begin(), nums.end());
        int score = INT_MAX;
        
        for(int i = 0; i <= n-k; i++){
            score = min(score, nums[i-1+k]-nums[i]);
        }
        
        return score;
    }
};
