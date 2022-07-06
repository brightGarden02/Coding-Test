package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int m, n, k;
    private static int[][] arr;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};
    private static boolean[][] visited;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){

            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[n][m];
            visited = new boolean[n][m];

            while(k-- > 0){

                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }

            int count = 0;
            for (int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(arr[i][j] == 1 && !visited[i][j]){
                        count++;
                        bfs(i, j);
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m
                && !visited[nextX][nextY] && arr[nextX][nextY] == 1){

                    visited[nextX][nextY] = true;
                    queue.add(new int[] {nextX, nextY});
                }
            }
        }


    }
}
