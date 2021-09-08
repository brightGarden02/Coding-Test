import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        ArrayList<Double> list = new ArrayList<>();
        
        Arrays.sort(stages);
        
        
        
        for(int i = 1; i <= N; i++){
            double notClear = 0.0;
            double staged = 0.0;
            double failPercent = 0.0;
            
            
            for(int j = 0; j < stages.length; j++){
            
                if(i == stages[j]){
                    notClear++;
                }
                if(i <= stages[j]){
                    staged++;
                }
                
                
            }
            if(staged == 0){
                failPercent = -1;
            }else{
                failPercent = notClear/staged;
            }
            // System.out.println("notClear: " + notClear + ", staged: " + staged + ", failPercent: " + failPercent);
            list.add(failPercent);   
        }
       ArrayList<Double> reverseList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++)
            reverseList.add(list.get(i));
        
        // System.out.print("list: ");
        // for(int i = 0; i < list.size(); i++)
        //     System.out.print(list.get(i) + " ");
        // System.out.println();
        
        // System.out.print("reverse: ");
        Collections.sort(reverseList, Collections.reverseOrder());
         // for(int i = 0; i < reverseList.size(); i++)
         //    System.out.print(reverseList.get(i) + " ");       
        
        
        for(int i = 0; i < reverseList.size(); i++){
            for(int k = 0; k < list.size(); k++){
                if(reverseList.get(i) == list.get(k)){
                    answer[i] = k+1;
                    list.set(k, -1.0);
                    break;
                }
            }
        }
        
        
        return answer;
    }
}