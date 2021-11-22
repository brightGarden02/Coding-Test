class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int l = 0;
        int r = nums.length-1;
        
        int i = nums.length-1;
        int[] answer = new int[nums.length];
        while(l <= r){
        
            if(nums[l] * nums[l] > nums[r] * nums[r]){
                answer[i] = nums[l] * nums[l];
                l++;
            }
            else{
                answer[i] = nums[r] * nums[r];
                r--;
            }
            i--;
        }
        return answer;
    }
}