import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < record.length; i++){
            String str = record[i];
            
            String[] strArray = str.split(" ");
            String message = strArray[0];
            String getId = strArray[1];
            
            switch(message){
                case "Enter":
                    map.put(getId, strArray[2]);
                    list.add(getId + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    list.add(getId + "님이 나갔습니다.");
                    break;
                case "Change":
                    map.put(getId, strArray[2]);
                    break;
            }
        }
        String[] answer = new String[list.size()];
        
        int i = 0;
        for(String str : list){
            int endOfIndex = str.indexOf("님");
            String getId = str.substring(0, endOfIndex);
            answer[i] = str.replace(getId, map.get(getId));
            i++;
        }
        
        
        return answer;
    }
}