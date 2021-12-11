class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;

        for(int i = 0; i < nums.length ; i++){
            sum += nums[i];
            
            if(sum == k) count++;
            if(map.get(sum-k) != null) count += map.get(sum-k);
            
            if(map.get(sum) != null)
                map.put(sum, map.get(sum) + 1); 
            else
                map.put(sum, 1); 
        }
        
        return count;
    }
}