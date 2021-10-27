class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length-1];
        
        int divisor = 1;
        int answer = 1;
        for(int i = divisor; i <= smallest; i++){
            if(smallest % i == 0 && largest % i == 0){
                answer = i;
            }
            
        }
        return answer;
    }
}