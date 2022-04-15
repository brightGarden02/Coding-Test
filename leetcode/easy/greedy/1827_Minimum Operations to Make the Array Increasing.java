class Solution {
    public int minOperations(int[] nums) {
        
        int ans = 0;
        for(int i = 0; i < nums.length-1; i++){
            
            int dif = 0;
            if(nums[i] >= nums[i+1]){
                dif = nums[i] - nums[i+1] + 1;
                nums[i+1] += dif;
                ans += dif;
            }    
            
        }
        return ans;
        
    }
}
