import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //우선순위 큐 2개 사용. 내림차순 정렬
        PriorityQueue<Integer> posiveQ = new PriorityQueue<>((p1, p2) -> p2 - p1);
        PriorityQueue<Integer> negativeQ = new PriorityQueue<>((p1, p2) -> p2 - p1);

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){

            int temp = Integer.parseInt(st.nextToken());
            if(temp > 0){
                posiveQ.offer(temp);
            }
            else{
                negativeQ.offer(Math.abs(temp));
            }

        }

        // 가장 멀리 있는 책의 위치
        int maxBookLocation = getMaxBookLocation(posiveQ, negativeQ);


        // 큐 2개에 대한 걸음수의 합
        int answer = 0;
        answer = getStepCounts(m, posiveQ, answer);
        answer = getStepCounts(m, negativeQ, answer);


        // 가장 멀리 있는 책의 위치에서 돌아오지 않으므로 빼줌
        answer -= maxBookLocation;


        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    
    private static int getMaxBookLocation(PriorityQueue<Integer> posiveQ, PriorityQueue<Integer> negativeQ) {

        int maxBookLocation = 0;

        if(posiveQ.isEmpty()){
            maxBookLocation = negativeQ.peek();
        }
        else if(negativeQ.isEmpty()){
            maxBookLocation = posiveQ.peek();
        }
        else{
            maxBookLocation = Math.max(posiveQ.peek(), negativeQ.peek());
        }

        return maxBookLocation;
    }

    
    private static int getStepCounts(int m, PriorityQueue<Integer> q, int answer) {
        
        while(!q.isEmpty()){

            int temp = q.poll();
            for(int i = 0; i < m -1; i++){
                q.poll();

                if(q.isEmpty()){
                    break;
                }
            }
            answer += temp * 2;
        }
        return answer;
    }
}
