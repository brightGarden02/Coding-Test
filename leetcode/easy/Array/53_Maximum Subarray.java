class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int curMax = 0;
        for(int i = 0; i < nums.length; i++){
            
            curMax = Math.max(curMax + nums[i], nums[i]);
            
            max = Math.max(curMax, max); 
        }
        
        return max;
    }
}