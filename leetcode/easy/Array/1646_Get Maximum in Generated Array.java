class Solution {
    public int getMaximumGenerated(int n) {
        
        int[] nums = new int[n+1];
        
        for(int i = 0; i < n+1; i++){
            
            if(i == 0){
                nums[0] = 0;
            }
            if(i == 1){
                nums[1] = 1;
            }
            if(2 <= 2 * i && 2 * i <= n){
                nums[2 * i] = nums[i];
            }
            if(2 <= 2 * i + 1 && 2 * i + 1 <= n){
                nums[2 * i + 1] = nums[i] + nums[i + 1];
                
            }
        }
        
        Arrays.sort(nums);
        
        return nums[n];
    }
}