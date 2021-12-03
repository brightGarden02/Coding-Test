public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        String strN = Integer.toBinaryString(n);
        
        int answer = 0;
        for(int i = 0; i < strN.length(); i++){
            if(strN.charAt(i) == '1')
                answer++;
        }
        
        return answer;
    }
}