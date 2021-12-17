class Solution {
    public int countBinarySubstrings(String s) {
        
        int ans = 0, i = 1, prev = 0, curr = 1;
        
        while(i < s.length()){
            
            if(s.charAt(i-1) != s.charAt(i)){
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
            else{
                curr++;
            }
            i++;
        }
                
        return ans += Math.min(prev, curr);
    }
}