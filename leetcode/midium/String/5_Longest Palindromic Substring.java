class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() == 1) return s;
        
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            
            String even = palindromeStr(s, i, i);
            if(ans.length() < even.length()){
                ans = even;
            }
            
            String odd = palindromeStr(s, i, i+1);
            if(ans.length() < odd.length()){
                ans = odd;
            }
        }
        
        return ans;
    }
    
    public String palindromeStr(String s, int left, int right){
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        return s.substring(left+1, right);
    }
}