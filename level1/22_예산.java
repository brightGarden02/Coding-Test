import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length && budget > 0; i++){
            budget = budget - d[i];
            answer++;
        }
        
        if(budget < 0){
            answer--;
            return answer;
        }
            
        return answer;
    }
}