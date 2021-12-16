class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int l1 = 0;
        int l2 = 0;
        
        String ans = "";
        while(l1 < word1.length() || l2 < word2.length()){
            
            if(l1 < word1.length()){
                
                ans += word1.substring(l1, l1+1);
                l1++;
            }
            
            if(l2 < word2.length()){
            
                ans += word2.substring(l2, l2+1);
                l2++;
            }
            
        }
        return ans;
    }
}