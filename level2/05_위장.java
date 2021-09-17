import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            String clothesType = clothes[i][1]; 
            hm.put(clothesType, hm.getOrDefault(clothesType, 0) + 1);
        }
        
        int combineAnswer = 1;
        for(String key : hm.keySet()){
            combineAnswer *= hm.get(key)+1;
        }
        
        answer = combineAnswer -1;
        
        return answer;
    }
}