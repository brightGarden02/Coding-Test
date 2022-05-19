package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class GasStation implements Comparable<GasStation>{
        int s, oil;
        public GasStation(int s, int oil) {
            this.s = s;
            this.oil = oil;
        }

        @Override
        public int compareTo(GasStation o) {
            return this.s - o.s;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<GasStation> stations = new PriorityQueue<>();

        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int oil = Integer.parseInt(st.nextToken());

            stations.add(new GasStation(s, oil));
        }

        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> fuels = new PriorityQueue<>(Collections.reverseOrder());

        int answer = 0;

        while(P < L) {

            while (!stations.isEmpty() && stations.peek().s <= P) {
                fuels.add(stations.poll().oil);
            }

            if (fuels.isEmpty()) {
                System.out.println(-1);
                return;
            }

            answer++;
            P += fuels.poll();
        }

        System.out.println(answer);
    }
}