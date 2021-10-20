import java.util.Hashtable;
import java.util.Map;

class Solution {
    public String restoreString(String s, int[] indices) {
        
        Hashtable<Integer, String> ht = new Hashtable<>();
        
        for(int i = 0; i < s.length(); i++){
            ht.put(indices[i], s.substring(i, i+1));
        }
        
        String answer = "";
        for(Map.Entry<Integer, String> m : ht.entrySet()){
            answer =  m.getValue() + answer;
        }

        return answer;
    }
}
