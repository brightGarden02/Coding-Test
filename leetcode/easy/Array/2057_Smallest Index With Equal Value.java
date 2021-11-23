class Solution {
    public int smallestEqual(int[] nums) {
        
        int answerIndex = 0;
        int minIndex = 0;
        int numbers = 0;
        for(int i = nums.length-1; i >= 0; i--){
            
            if(i%10 == nums[i]){
                answerIndex = i;
                numbers++;
            }
        }
        
        if(numbers == 0)
            return -1;
        
        return answerIndex;
    }
}