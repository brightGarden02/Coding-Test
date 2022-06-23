import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.offer(i);
        }
        
        while(pq.peek() < K && !pq.isEmpty()){
            if(pq.size() == 1) return -1;
            
            int min = pq.poll();
            int secondMin = pq.poll();            
            int made = min + secondMin*2;
            pq.offer(made);
            answer++;
        }
        
        return answer;
    }
}
