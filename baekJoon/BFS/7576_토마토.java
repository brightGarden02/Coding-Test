package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[][] arr;
    private static int m, n;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};
    private static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    queue.add(new int[] {i, j});
                }
            }
        }

        bfs();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }

        int days = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                days = Math.max(days, arr[i][j]);
            }
        }

        System.out.println(days-1);
    }

    private static void bfs() {

        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m &&
                arr[nextX][nextY] == 0){

                    arr[nextX][nextY] = arr[nowX][nowY] + 1;
                    queue.add(new int[] {nextX, nextY});
                }
            }
        }
    }
}
