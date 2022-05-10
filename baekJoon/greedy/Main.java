package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){

            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();
            while(st.hasMoreTokens()){
                pq.add(Long.parseLong(st.nextToken()));
            }

            Long sum = (long)0;
            while(pq.size() > 1){
                Long a = pq.poll();
                Long b = pq.poll();
                sum += a + b;
                pq.add(a+b);
            }
            bw.write(sum + "\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}