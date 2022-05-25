package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int m, n, k;
    private static int count;

    private static int[][] area;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int a = 0; a < T; a++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            area = new int[m][n];
            visited = new boolean[m][n];

            while(k > 0){

                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                area[x][y] = 1;

                k--;
            }

            count = 0;
            for(int i = 0; i < m; i++){

                for(int j = 0; j < n; j++){
                    if(area[i][j] == 1 && !visited[i][j]){
                        bfs(i, j);
                        count++;
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

                if(nextX >= 0 && nextY >= 0 && nextX < m && nextY < n){

                    if(area[nextX][nextY] == 1 && !visited[nextX][nextY]){
                        visited[nextX][nextY] = true;
                        queue.add(new int[] {nextX, nextY});
                    }
                }
            }
        }

    }
}
