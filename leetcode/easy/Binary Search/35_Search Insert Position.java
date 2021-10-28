class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int index = 0;
        while(index < nums.length && nums[index] <= target){
            
            if(nums[index] == target)
                return index;
            index++;
        }
        
        return index;
    }
}
