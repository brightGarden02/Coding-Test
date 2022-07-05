package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int n, curX, curY, endX, endY;
    private static int[][] chess;
    private static int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
    private static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            
            n = Integer.parseInt(br.readLine());
            chess = new int[n][n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            curX = Integer.parseInt(st.nextToken());
            curY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());
            
            bfs();

            System.out.println(chess[endX][endY]);
        }
        

    }

    private static void bfs() {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{curX, curY});

        boolean[][] visited = new boolean[n][n];
        visited[curX][curY] = true;

        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 8; i++){

                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n
                && !visited[nextX][nextY]){

                    visited[nextX][nextY] = true;
                    chess[nextX][nextY] = chess[nowX][nowY] + 1;
                    queue.add(new int[]{nextX, nextY});
                }

                if(nextX == endX && nextY == endY){
                    return;
                }

            }
        }

    }
}
