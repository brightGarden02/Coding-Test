import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0; i < answers.length; i++){
            
            if(s1[i%5] == answers[i])
                answer[0]++;

            if(s2[i%8] == answers[i])
                answer[1]++;
            
            if(s3[i%10] == answers[i])
                answer[2]++;
        }
        
        int max = -1;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] > max){
                max = answer[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == max){
                list.add(i+1);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;   
    }
}
