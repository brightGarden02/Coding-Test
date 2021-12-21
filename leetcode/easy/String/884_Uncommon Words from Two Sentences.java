import java.util.Map.Entry;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr1){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for(String s : arr2){
            map.put(s, map.getOrDefault(s, 0) + 1);
            
        }
        
        
        ArrayList<String> al = new ArrayList<>();
        
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            
            if (entry.getValue() == 1) {
                al.add(entry.getKey());
            }
        }

        
        String[] ans = new String[al.size()];
        for(int i = 0; i < ans.length; i++){
            
            ans[i] = al.get(i);
        }
        
        return ans;
    }
}