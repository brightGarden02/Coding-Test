class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length/2;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            
        }
        System.out.println(hm);
        
        
        for(int i : hm.values()){
            if(i > n){
                return getKey(hm, i);
            }
        }
        return 0;
    }
    
   public static <K, V> K getKey(Map<K, V> map, V value) {
 
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
    
}