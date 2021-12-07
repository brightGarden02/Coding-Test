class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        Arrays.sort(nums);
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        
        int sum2 = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length-1; i >= 0; i--){
            sum -= nums[i];
            sum2 += nums[i];
            list.add(nums[i]);
            
            if(sum2 > sum){
                break;    
            }
        }
        return list;
        
    }
}