import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        long remainer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 0){
            
            remainer = n%10;
            n = n/10;
            list.add((int)remainer);
            
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}