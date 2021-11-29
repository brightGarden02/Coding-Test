class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] answer = new int[26];
        for(int i = 0; i < magazine.length(); i++){
            answer[magazine.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            answer[ransomNote.charAt(i) - 'a']--;
        }
        
        for(int i : answer){
            if(i < 0){
                return false;
            }
        }
        return true;
        
    }
}