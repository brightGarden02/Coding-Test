import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridgeQueue = new LinkedList<>();
        
        int time = 0, bridge_weight = 0;
        for(int truck : truck_weights){
            
            while(true){
                
                if(bridgeQueue.isEmpty()){
                    bridgeQueue.offer(truck);
                    bridge_weight += truck;
                    time++;
                    break;
                }
                else if(bridgeQueue.size() == bridge_length){
                    bridge_weight -= bridgeQueue.poll();
                    
                }
                else{
                    if(truck + bridge_weight <= weight){
                        bridgeQueue.offer(truck);
                        bridge_weight += truck;
                        time++;
                        break;
                    }
                    else{
                        bridgeQueue.offer(0);
                        time++;
                    }
                }
            }
        }
        
        answer += time + bridge_length;
        
        return answer;
    }
}
