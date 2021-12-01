class Solution {
    
    List<List<Integer>> list = new ArrayList<>();
    LinkedList<Integer> tmpList = new LinkedList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        
        bt(nums, 0);
        return list;
    }
    
    public void bt(int[] nums, int start){
        
        if(tmpList.size() == nums.length){
            
            list.add(new ArrayList<>(tmpList));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            
            if(tmpList.contains(nums[i])) continue;
            
            tmpList.add(nums[i]);
            bt(nums, start+1);
            tmpList.removeLast();
        }
        
    }
}