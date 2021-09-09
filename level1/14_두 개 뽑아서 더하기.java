import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Arrays.sort(numbers);
        int data = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            
            for(int j = 0; j < numbers.length; j++){
                
                if(i != j){
                    data = numbers[i] + numbers[j];
                    if(!list.contains(data)){
                        list.add(data);
                    }
                }
            }
        }
        Collections.sort(list);
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}