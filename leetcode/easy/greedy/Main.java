class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n && k > 0; i++){
            
            if(nums[i] < 0){
                nums[i] = -nums[i];
                k--;
            }
            else if(nums[i] == 0){
                k = 0;
            }
        }    
        Arrays.sort(nums);
        for(int i = 0; i < n && k > 0; i++){
            
            if(k % 2 == 0){
                k = 0;    
            } 
            else{
                nums[i] = -nums[i];
            }
            k--;
        }
        
        
        for(int num : nums){
            ans += num;
        }
        
        
        return ans;
    }
}
