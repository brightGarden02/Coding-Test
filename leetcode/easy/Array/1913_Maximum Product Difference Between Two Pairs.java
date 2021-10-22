import java.util.Arrays;
class Solution {
    public int maxProductDifference(int[] nums) {
        
        Arrays.sort(nums);
        int answer = 0;
        answer = nums[nums.length-1] * nums[nums.length-2] - nums[1] * nums[0];
        
        return answer;
        
    }
}