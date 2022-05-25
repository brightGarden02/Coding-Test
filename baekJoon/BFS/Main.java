package ex;
import com.sun.source.doctree.SinceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] map;
    static int n;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int[] aparts = new int[25*25];
    static int count = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < n; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }



        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    count++;
                    bfs(i ,j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(count);


        for(int i = 0; i < aparts.length; i++){
            if(aparts[i] != 0){
                System.out.println(aparts[i]);
            }
        }

    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;
        aparts[count]++;

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++){

                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n){

                    if(map[nextX][nextY] == 1 && !visited[nextX][nextY]){
                        queue.add(new int[] {nextX, nextY});
                        visited[nextX][nextY] = true;
                        aparts[count]++;
                    }
                }

            }

        }

    }
}
