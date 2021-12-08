class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        Map<String, Integer> hm = new HashMap<>();
        
        for(String s : words1){
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        
        for(String s : words2){
            
            if(hm.containsKey(s)){
                if(hm.get(s) <= 1){
                    hm.put(s, hm.get(s) - 1);
                }    
            }
        }
        
        int count = 0;
        for(String s : words1){
            if(hm.get(s) == 0){
                count++;
            }   
        }
        
        return count;
    }
}