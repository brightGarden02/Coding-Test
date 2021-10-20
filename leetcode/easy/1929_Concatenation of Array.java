class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length*2;
        int[] answer = new int[n];
        
        int j = 0;
        for(int i = 0; i < answer.length; i++){
            if(j >= nums.length){
                j = 0;
                answer[i] = nums[j];
            }else{
                answer[i] = nums[j];
            }
            j++;
        }
        return answer;
    }
}