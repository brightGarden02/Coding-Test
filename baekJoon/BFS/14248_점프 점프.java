package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int n, startX;
    private static int[] arr;
    private static boolean[] visited;
    private static int[] direction = {-1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        visited = new boolean[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        startX = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(bfs());

    }

    private static int bfs(){

        Queue<Integer> queue = new LinkedList<>();
        visited[startX] = true;
        queue.add(startX);

        int cnt = 1;
        while (!queue.isEmpty()){

            int now = queue.poll();
            for(int d = 0; d < 2; d++){

                int nowX = now + direction[d] * arr[now];

                if(nowX >= 1 && nowX <= n && !visited[nowX]){
                    visited[nowX] = true;
                    queue.add(nowX);
                    cnt++;
                }
            }
        }

        return cnt;
    }

}
