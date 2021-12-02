class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        int[] array = new int[n];
        array[0] = nums[0];
        if(n == 1){
            return nums[0];
        }
        array[1] = Math.max(nums[0], nums[1]);
        
        for(int i=2; i < n; i++){
            array[i] = Math.max(nums[i] + array[i-2], array[i-1]);
        }
        
        return array[n-1];
    }
}