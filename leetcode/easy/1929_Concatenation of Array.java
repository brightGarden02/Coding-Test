class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length*2;
        int[] answer = new int[n];
        
        for(int i = 0; i < nums.length; i++){
            answer[i] = nums[i];
            answer[i+nums.length] = nums[i];
        }
        
        return answer;
    }
}