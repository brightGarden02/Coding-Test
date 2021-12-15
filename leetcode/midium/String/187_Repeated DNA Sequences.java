class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i <= s.length()-10; i++){
            
            String tmp = s.substring(i, i+10);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            
        }
        
        for(String key : map.keySet()){
            if(map.get(key) > 1){
                ans.add(key);
            }
        }
        
        return ans;
    }
}