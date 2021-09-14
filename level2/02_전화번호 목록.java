import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i], i);
        }
        
        for(int i = 0; i < phone_book.length; i++){
            
            for(int j = 1; j < phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0, j))){
                //    System.out.println("length:" + phone_book[i].length() + ", j: " + j + ", " + phone_book[i].substring(0, j));
                    return false;
                    }
                
            }
        }
        
        return answer;
    }
}