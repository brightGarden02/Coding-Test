class Solution {
public:
    vector<int> largestDivisibleSubset(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        int n = nums.size();
        
        vector<int> dp(n, 1), prev_idx(n, -1), ans;
        int max_idx = 0;
        
        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {
                if ((nums[i] % nums[j] == 0) && (dp[i] < dp[j]+1)) {
                    dp[i] = dp[j]+1;
                    prev_idx[i] = j;
                }
            }
            
            if(dp[i] > dp[max_idx]){
                max_idx = i;
            }
        }
        
        int i = max_idx;
        while (i >= 0) {
            ans.push_back(nums[i]);
            i = prev_idx[i];
        }
        
        return ans;
    }
};
