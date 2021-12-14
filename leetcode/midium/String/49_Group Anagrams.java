class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            
            String k = String.valueOf(charArray);
            if(!map.containsKey(k)){
                map.put(k, new ArrayList<String>());
            }
            map.get(k).add(str);
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(String k : map.keySet()){
            ans.add(map.get(k));
        }
        
        return ans;
    }
}