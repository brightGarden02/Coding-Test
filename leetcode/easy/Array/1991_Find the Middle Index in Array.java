class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int result1 = 0;
        int result2 = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(i == 0){
                result1 = sumFunc(nums, 1, nums.length-1);
                if(result1 == 0){
                    return i;
                }
                
            }
            else if(i == nums.length-1){
                result1 = sumFunc(nums, 0, nums.length-2);
                if(result1 == 0){
                    return i;
                }
            }
            else{
                result1 = sumFunc(nums, 0, i-1);
                result2 = sumFunc(nums, i+1, nums.length-1);   
                if(result1 == result2){
                    return i;
                }
            }
            
        }
        return -1;
        
    }
    
    public int sumFunc(int[] nums, int start, int end){
        
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += nums[i];
        }
        
        return sum;
    }
}