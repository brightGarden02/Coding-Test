class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        
        int sum1 = 0;
        for(int i = 0; i < n; i++){
            
            sum1 += nums[i];
        }
        
        int sum2 = 0;
        int idx = 0;
        for(int i = n-1; i >= 0; i--){
            
            sum1 -= nums[i];
            sum2 += nums[i];
            if(sum1 < sum2){
                idx = i;
                break;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = n-1; i >= idx; i--){
            list.add(nums[i]);
        }
    
        return list;
    }
}
