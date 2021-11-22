class Solution {
    public void moveZeroes(int[] nums) {
        
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[left] = nums[i];
                left++;
            }
        }
        
        for(int i = left; i < nums.length; i++){
            nums[i] = 0;
        }
        
    }
}