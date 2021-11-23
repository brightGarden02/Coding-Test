class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap();
        int error = -1, missing = 1;
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(int i = 1; i <= nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2)
                    error = i;
            }
            else{
                missing = i;
            }
        }
        int[] answer = new int[2];
        answer[0] = error;
        answer[1] = missing;
        return answer;
    }
}