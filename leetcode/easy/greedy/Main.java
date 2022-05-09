package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });


        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        sortTimeArr(arr);

        int answer = 1;

        // 끝나는 시간 큐에 넣음
        pq.offer(arr[0][1]);
        for(int i = 1; i < n; i++){

            while(!pq.isEmpty() && pq.peek() <= arr[i][0]){

                pq.poll();
            }

            pq.offer(arr[i][1]);
            answer = Math.max(answer, pq.size());

        }


        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void sortTimeArr(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                else{
                    return o1[0] - o2[0];
                }
            }
        });
    }
}