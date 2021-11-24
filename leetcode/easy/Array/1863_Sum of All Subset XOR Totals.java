class Solution {
    public int subsetXORSum(int[] nums) {
        
        return xorSum(nums, 0, 0);
    }
    
    public int xorSum(int[] nums, int i, int xor){
        if(i == nums.length) return xor;
        
        return xorSum(nums, i+1, xor^nums[i]) + xorSum(nums, i+1, xor);
    }
}