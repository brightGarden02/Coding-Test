class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map = new HashMap<>();
        
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++){
            
            if(!map.containsValue(arr[i])){
                map.put(pattern.charAt(i), arr[i]);
            }
            
        }
        
        boolean ans = false;
        for(int i = 0; i < pattern.length(); i++){
            
            String s1 = map.get(pattern.charAt(i));
            String s2 = arr[i];
            
            if(s1 == null){
                return false;
            }
            if(s1.equals(s2)){
                ans = true;
            }
            else{
                return false;
            }
            
        }
        
        return ans;
    }
} 