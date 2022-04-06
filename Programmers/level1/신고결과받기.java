import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];
        HashMap<String, Set<String>> reporterMap = new HashMap<>();
        HashMap<String , Integer> gotSingoMap = new HashMap<>();
        
        for(String id : id_list){
            
            reporterMap.put(id, new HashSet<>());
            gotSingoMap.put(id, 0);
        }
        
        for(String rep : report){
            
            String[] ids = rep.split(" ");
            String fromId = ids[0];
            String toId = ids[1];
            
            
            if(reporterMap.get(fromId).add(toId)){
                gotSingoMap.put(toId, gotSingoMap.get(toId) + 1);
            }
        }
        
        for(String rep : report){
            
            String[] ids = rep.split(" ");
            String fromId = ids[0];
            String toId = ids[1];
            
            if(gotSingoMap.get(toId) < k){
                reporterMap.get(fromId).remove(toId);
            }
            
        }
        
        
        for(int i = 0; i < id_list.length; i++){
            String id = id_list[i];
            answer[i] = reporterMap.get(id).size();
        }
        
        return answer;
    }
}
