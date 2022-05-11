import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int answer = 0;

        for(int i = 0; i < n; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        while(pq.size() > 1){

            int a = pq.poll();
            int b = pq.poll();
            answer += a + b;
            pq.add(a + b);

        }


        bw.write(answer + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
