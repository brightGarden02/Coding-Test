class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] answer = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            answer[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < t.length(); i++){
            answer[t.charAt(i) - 'a']--;
        }
        
        for(int i : answer){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}