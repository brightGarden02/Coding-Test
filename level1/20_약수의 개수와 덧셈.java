import java.util.HashSet;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int number = left; number <= right; number++){
            HashSet<Integer> counts = new HashSet<>();
            for(int i = 1; i <= number; i++){
                if(number%i == 0){
                    counts.add(i);
                }
            }
            if(counts.size()%2 == 0){
                answer += number;
            }
            else{
                answer -= number;
            }
        }
        
        return answer;
    }
}