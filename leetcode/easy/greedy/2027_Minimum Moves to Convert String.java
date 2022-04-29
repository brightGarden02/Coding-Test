class Solution {
    public int minimumMoves(String s) {
        
        int n = s.length();
        int ans = 0;
        
        int i = 0;
        while(i < n){
            
            if(s.charAt(i) == 'X'){
                i = i + 3;
                ans++;
            }    
            else{
                i++;
            }
            
        }
        
        return ans;
    }
}
