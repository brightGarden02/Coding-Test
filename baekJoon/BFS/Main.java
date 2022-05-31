package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n, m;
    private static int[][] space;
    private static boolean[][] visited;
    private static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    private static int[] dy = {1, 0, -1, -1, -1, 0, 1, 1};
    private static int answer;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        space = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                space[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(space[i][j] == 0){
                    bfs(i, j);
                }
            }
        }

        System.out.println(answer);
    }

    private static void bfs(int x, int y) {

        visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;
        int cnt = 0;

        while(!queue.isEmpty()){

            int size = queue.size();
            for(int s = 0; s < size; s++){

                int[] now = queue.poll();
                int nowX = now[0];
                int nowY = now[1];

                if(space[nowX][nowY] == 1){
                    answer = Math.max(answer, cnt);
                    return;
                }

                for(int i = 0 ; i < 8; i++){
                    int nextX = nowX + dx[i];
                    int nextY = nowY + dy[i];

                    if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m
                            && !visited[nextX][nextY]){

                        visited[nextX][nextY] = true;
                        queue.add(new int[] {nextX, nextY});
                    }
                }
            }
            cnt++;

        }

    }
}