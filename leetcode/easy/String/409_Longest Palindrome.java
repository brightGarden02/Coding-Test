class Solution {
    public int longestPalindrome(String s) {
     
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int value = 0;
        int ans = 0;
        boolean odd = false;
        for(Map.Entry<Character, Integer> entries : map.entrySet()){
            
            value = entries.getValue();
            
            if(value%2 == 0){
                ans += value;
            }
            else {
                odd = true;
                ans += value - 1;
            }
        }
        
        return ans + (odd ? 1 : 0);
    }
}