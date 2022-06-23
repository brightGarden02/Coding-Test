class Solution {
    public int solution(String s) {
        int answer = 0;
        int min = s.length();
        for(int i = 1; i <= s.length()/2; i++){
            int sLen = compress(s, i).length();
            min = Math.min(min, sLen);
        }
        answer = min;
        return answer;
    }
    public String compress(String s, int i){
        
    }
    
}
