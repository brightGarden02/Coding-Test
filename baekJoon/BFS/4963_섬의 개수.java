package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    private static int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};

    private static int[][] map;
    private static boolean[][] visited;
    private static int h, w;

    private static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while(true){

            str = br.readLine();
            if(str.equals("0 0")) break;

            String[] arr = str.split(" ");
            w = Integer.parseInt(arr[0]);
            h = Integer.parseInt(arr[1]);


            map = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            cnt = 0;
            for (int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(!visited[i][j]){
                        bfs(i, j);
                    }
                }
            }

            System.out.println(cnt);
        }

    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        if(map[x][y] == 0){
            return;
        }

        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int d = 0; d < 8; d++){
                int nextX = nowX + dx[d];
                int nextY = nowY + dy[d];

                if(nextX >= 0 && nextY >= 0 && nextX < h && nextY < w){

                    if(!visited[nextX][nextY] && map[nextX][nextY] == 1){
                        queue.add(new int[] {nextX, nextY});
                    }

                    if(!visited[nextX][nextY]){
                        visited[nextX][nextY] = true;
                    }

                }

            }

        }

        cnt++;
    }
}
