class Solution {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
        
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size() && k > 0; i++){
            
            if(nums[i] < 0){
                nums[i] = -nums[i];
                k--;  
            }
            else if(nums[i] == 0){
                k = 0;
            }
        }
        
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size() && k > 0; i++){
             
            if(k%2 == 0) k = 0;
            else nums[i] = -nums[i];
            k--; 
        }
            
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums[i];
        }
        
        return sum;
    }
};