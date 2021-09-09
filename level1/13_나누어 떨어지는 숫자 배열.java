import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        
        if(list.isEmpty()){
            int[] answer = new int[1];
            answer[0] = -1;
            
            return answer;
        }
        else{
            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++)
                answer[i] = list.get(i);
            
            return answer;
        }
    }
}