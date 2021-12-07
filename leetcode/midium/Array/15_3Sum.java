class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashSet<List<Integer>> answer = new HashSet<>();
        if(nums.length < 3)
            return new ArrayList(answer);
        else{
            Arrays.sort(nums);
            for(int i = 0; i < nums.length-2; i++){
                int j = i + 1, k = nums.length-1;
                while(j < k){
                    
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    if(sum < 0) j++;
                    else k--;
                    
                }
            }
            
            return new ArrayList(answer);
        }
    }
}