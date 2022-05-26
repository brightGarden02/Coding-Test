package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n;
    private static int[][] map;
    private static boolean[][] visit;

    private static int h = 0;
    private static int maxH = 0;

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];


        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){

                map[i][j] = Integer.parseInt(st.nextToken());
                maxH = Math.max(maxH, map[i][j]);
            }
        }

        int count = 0;
        int answer = 0;
        while(h < maxH){
            visit = new boolean[n][n];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(map[i][j] <= h){
                        visit[i][j] = true;
                    }
                }
            }

            count = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(!visit[i][j]){
                        bfs(i, j);
                        count++;
                    }
                }
            }

            answer = Math.max(count, answer);
            h++;
        }

        System.out.println(answer);


    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visit[x][y] = true;

        while (!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++){

                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n){

                    if(!visit[nextX][nextY]){
                        visit[nextX][nextY] = true;
                        queue.add(new int[] {nextX, nextY});
                    }

                }
            }
        }


    }
}
