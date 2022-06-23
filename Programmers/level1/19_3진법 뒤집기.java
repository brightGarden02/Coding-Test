import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int remainer = 0;
        String digits = "";
        
        while(n > 0){
            remainer = n%3;
            digits += remainer;
            n = n/3;
        }
        
        for(int i = 0, j = digits.length()-1; i < digits.length() && j >= 0; i++, j--){
            answer += Math.pow(3, j) * (digits.charAt(i) - '0');
        }
        
        return answer;
    }
}
