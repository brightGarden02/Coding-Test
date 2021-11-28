class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length() < s1.length()){
            return false;
        }
        
        int[] s1Counts = new int[26];
        for(char ch : s1.toCharArray()){
            s1Counts[ch - 'a']++;
        }
        
        int l = 0;
        int[] s2Counts = new int[26];
        for(int i = 0; i < s2.length(); i++){
            int idx = s2.charAt(i) - 'a';
            s2Counts[idx]++;
            
            while(s2Counts[idx] > s1Counts[idx]){
                s2Counts[s2.charAt(l) - 'a']--;
                l++;
            }
            
            if(i - l + 1 == s1.length()){
                return true;
            }
            
            
        }
        return false;
        
    }
}