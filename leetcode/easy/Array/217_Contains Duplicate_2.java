class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int data : nums){
            if(set.contains(data))
                return true;
            set.add(data);
        }
        
        return false;
    }
}