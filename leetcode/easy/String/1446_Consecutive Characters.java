class Solution {
    public int maxPower(String s) {
        
        if(s.length() == 1) return 1;
        
        int ans = 1;
        int max = 0;
        for(int i = 0; i < s.length()-1; i++){
            
            if(s.charAt(i) == s.charAt(i+1)){
                ans++;
            }
            else{
                ans = 1;
            }
            max = Math.max(max, ans);
        }
        
        return max;
    }
}