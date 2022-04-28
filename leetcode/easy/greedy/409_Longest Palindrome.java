class Solution {
    public int longestPalindrome(String s) {
        
        int n = s.length();
        int answer = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c, 1);
            }
            else{
                hm.put(c, hm.getOrDefault(c, 1) + 1);
            }
            
        }
        
        boolean oddExist = false;
        for(char key : hm.keySet()){
            if(hm.get(key) % 2 == 0){
                answer += hm.get(key);
            }
            else{
                oddExist = true;
                answer += hm.get(key) - 1;
            }
        }
        
        return answer + (oddExist ? 1: 0);
    }
}
