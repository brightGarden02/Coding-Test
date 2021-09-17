import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] array = new int[progresses.length];
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            int progress = progresses[i];
            int speed = speeds[i];
            int complete = 100, days = 0;
            
            complete = complete - progress;
            while(complete > 0){
                complete = complete - speed;
                days++;
            }
            array[i] = days;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = array.length-1; i >= 0; i--){
            stack.push(array[i]);
        }
        while(!stack.isEmpty()){
            int distribution = 1;
            int days = stack.pop();
            
            while(!stack.isEmpty() && stack.peek() <= days){
                distribution++;
                stack.pop();
            }
            al.add(distribution);
        }
        
        
        int[] answer = new int[al.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = al.get(i);
        }
        
        
        return answer;
    }
}