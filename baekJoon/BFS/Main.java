package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int M, N, count;
    private static int[][] farm;
    private static boolean[][] visited;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};

    private static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        farm = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                farm[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(farm[i][j] == 1){
                    queue.add(new int[] {i, j});
                }
            }
        }

        bfs();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(farm[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }


        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                maxVal = Math.max(maxVal, farm[i][j]);
            }
        }

        System.out.println(maxVal-1);
    }

    private static void bfs() {

        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int d = 0; d < 4; d++){

                int nextX = nowX + dx[d];
                int nextY = nowY + dy[d];

                if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < M){

                    if(farm[nextX][nextY] == 0){
                        farm[nextX][nextY] = farm[nowX][nowY] + 1;
                        queue.add(new int[]{nextX, nextY});
                    }
                }
            }
        }

    }
}
