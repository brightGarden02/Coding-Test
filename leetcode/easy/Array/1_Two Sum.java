class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(hm.containsKey(target-nums[i])){
                answer[0] = hm.get(target-nums[i]);
                answer[1] = i;
                return answer;
            }
            else{
                hm.put(nums[i], i);
            }
        }
        return answer;
    }
}