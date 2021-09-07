import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start = 0, last = 0, index = 0;
        
        for(int i = 0; i < commands.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            start = commands[i][0];
            last = commands[i][1];
            start--; last--;      
            
            for(int j = start; j <= last; j++){
                list.add(array[j]);
            }
            
            Collections.sort(list);
            
            System.out.println();
            index = commands[i][2];
            index--;
            answer[i] = list.get(index);
       }
        return answer;
    }
}