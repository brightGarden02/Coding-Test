package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int n, m, startX, startY;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};
    private static int[][] map;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean found = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(map[i][j] == 2){
                    startX = i;
                    startY = j;
                    found = true;
                    break;
                }
            }

            if(found) break;
        }


        bfs();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && map[i][j] == 1){
                    map[i][j] = -1;
                }
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void bfs() {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        map[startX][startY] = 0;
        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int d = 0; d < 4; d++){

                int nextX = nowX + dx[d];
                int nextY = nowY + dy[d];
                if(nextX >= 0 && nextY >= 0 && nextX < n & nextY < m &&
                    !visited[nextX][nextY] && map[nextX][nextY] != 0){

                    map[nextX][nextY] = map[nowX][nowY] + 1;
                    visited[nextX][nextY] = true;
                    queue.add(new int[]{nextX, nextY});

                }
            }

        }

    }
}
