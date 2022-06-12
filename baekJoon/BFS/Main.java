package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static int N, count1, count2;
    private static char[][] area;
    private static boolean[][] visited;

    private static boolean flag;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        area = new char[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                area[i][j] = str.charAt(j);
            }
        }


        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                char color = area[i][j];
                if(!visited[i][j]){
                    bfs(i, j, color);
                }
            }
        }

        visited = new boolean[N][N];
        flag = true;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(area[i][j] == 'G'){
                    area[i][j] = 'R';
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                char color = area[i][j];
                if(!visited[i][j]){
                    bfs(i, j, color);
                }
            }
        }

        System.out.println(count1 + " " + count2);

    }

    private static void bfs(int x, int y, char color) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int d = 0; d < 4; d++){
                int nextX = nowX + dx[d];
                int nextY = nowY + dy[d];

                if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < N
                && !visited[nextX][nextY]){

                    if(area[nextX][nextY] == color){
                        visited[nextX][nextY] = true;
                        queue.add(new int[]{nextX, nextY});
                    }
                }
            }

        }

        if(!flag){
            count1++;
        }
        else{
            count2++;
        }

    }
}
