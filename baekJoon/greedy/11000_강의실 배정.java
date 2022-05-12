import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 1;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

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

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(arr[0][1]);
        int i = 1;
        while(i < n){

            if(arr[i][0] >= pq.peek()) {
                pq.poll();
            }

            pq.add(arr[i][1]);
            i++;
            answer = Math.max(answer, pq.size());
        }

        System.out.println(answer);
    }
}
