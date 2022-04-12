class Solution {
    public int balancedStringSplit(String s) {
        
        int n = s.length();
        int r = 0, l = 0, answer = 0;
        for(int i = 0; i < n; i++){
            
            if(s.charAt(i) == 'R'){
                r++;
            }
            else{
                l++;
            }
            if(r == l){
                answer++;
            }
        }
        
        return answer;
    }
}
