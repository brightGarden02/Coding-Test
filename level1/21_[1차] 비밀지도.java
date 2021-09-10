import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        int remainer = 0;
        ArrayList<String> list1 = new ArrayList<>();
        String data = "";
        int count = 0;
        
        for(int i = 0; i < arr1.length; i++){
            data = "";
            count = 0;
            while(arr1[i] > 0){
                remainer = arr1[i] % 2;
                data = Integer.toString(remainer) + data;
                count++;
                arr1[i] = arr1[i]/2;
            }
            while(data.length() < n){
                data = "0" + data;
                count++;
            }
            list1.add(data);
            
        }
        
        ArrayList<String> list2 = new ArrayList<>();
        
        for(int i = 0; i < arr2.length; i++){
            data = "";
            count = 0;
            while(arr2[i] > 0){
                remainer = arr2[i] % 2;
                data = Integer.toString(remainer) + data;
                count++;
                arr2[i] = arr2[i]/2;
            }
            while(data.length() < n){
                data = "0" + data;
                count++;
            }
            list2.add(data);
            
        }
        
        
        String a1 = "";
        String a2 = "";
        for(int i = 0; i < n; i++){
            a1 = list1.get(i);
            a2 = list2.get(i);
            if(answer[i] == null)
                answer[i] = "";
            
            for(int j = 0; j < a1.length(); j++){
                
                if(a1.charAt(j) == '1' || a2.charAt(j) == '1'){
                    answer[i] += "#"; 
                    
                }
                else if(a1.charAt(j) == '0' && a2.charAt(j) == '0'){
                    answer[i] += " ";
                }
            }
            
        }
        
        return answer;
    }
}