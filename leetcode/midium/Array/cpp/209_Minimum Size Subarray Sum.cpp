class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        
        int left = 0;
        int right = 0;
        int minLen = INT_MAX;
        int sum = 0;
        while(right < nums.size()){
            
            sum += nums[right++];
            while(sum >= target){
                
                minLen = min(minLen, right - left);
                sum -= nums[left++];
            }
        }
        
        return (minLen == INT_MAX) ? 0 : minLen;  
    }
};