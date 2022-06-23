import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int priority : priorities){
            pq.offer(priority);
        }
        
        while(!pq.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == (int)pq.peek()){
                    pq.poll();
                    answer++;
                    if(i == location){
                        pq.clear();
                        break;
                    }
                 }
            }
        }
        
        return answer;
    }
}
