package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n, m;
    private static int[][] laboratory;
    private static int[][] copy_laboratory;


    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static int result = Integer.MIN_VALUE;



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        laboratory = new int[n][m];
        copy_laboratory = new int[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                laboratory[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        copy_laboratory = laboratory;

        dfs(0);
        System.out.println(result);

    }

    //벽 세우기
    private static void dfs(int wall) {

        //벽 3개 세웠으면 바이러스 퍼뜨려보기
        if(wall == 3){
            bfs();
            return;
        }

        //벽 3개 못 세웠으면 다시 벽 세우기
        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                //빈칸이라면
                if(laboratory[i][j] == 0){

                    //벽 세우기
                    laboratory[i][j] = 1;
                    dfs(wall + 1);

                    //벽 다시 돌려놓기
                    laboratory[i][j] = 0;
                }
            }
        }

    }


    private static void bfs() {

        int[][] virus_map = new int[n][m];
        Queue<Virus> queue = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                virus_map[i][j] = laboratory[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){

                //바이러스면 큐에 넣기
                if(virus_map[i][j] == 2){
                    queue.add(new Virus(i, j));
                }
            }
        }


        while(!queue.isEmpty()){

            Virus v = queue.poll();

            for(int i = 0; i < 4; i++){
                int nextX = v.x + dx[i];
                int nextY = v.y + dy[i];


                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m){

                    //빈칸이라면 바이러스 퍼뜨리기
                    if(virus_map[nextX][nextY] == 0){
                        virus_map[nextX][nextY] = 2;
                        queue.add(new Virus(nextX, nextY));
                    }
                }
            }
        }
        safe(virus_map);

    }

    private static void safe(int[][] virus_map) {

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(virus_map[i][j] == 0){
                    count++;
                }
            }
        }

        result = Math.max(count, result);
    }


}

class Virus{
    int x, y;
    public Virus(int x, int y) {
        this.x = x;
        this.y = y;
    }
}