import java.util.Map.Entry;

class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        
        List<Entry<Integer, Integer>> list_entires = new ArrayList<>(hm.entrySet());
        
        Collections.sort(list_entires, new Comparator<Entry<Integer, Integer>>(){
            
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2){
                
                if(obj1.getValue() == obj2.getValue()){
                    return obj2.getKey().compareTo(obj1.getKey());
                }
                else{
                    return obj1.getValue().compareTo(obj2.getValue());
                }
            } 
        });
        
        int[] ans = new int[nums.length];
        
        int j = 0;
        for(Entry<Integer, Integer> entry : list_entires) {
			for(int i = 0; i < entry.getValue(); i++){
                ans[j] = entry.getKey();
                j++;
            }
		}
    
        
        return ans;
    }
}