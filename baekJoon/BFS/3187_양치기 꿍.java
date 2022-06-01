package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static char[][] area;
    private static boolean[][] visited;
    private static int r, c, sheep, wolf;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        area = new char[r][c];
        visited = new boolean[r][c];
        for (int i = 0; i < r; i++){
            String str = br.readLine();
            for(int j = 0; j < c; j++){
                char c = str.charAt(j);
                area[i][j] = c;
            }
        }

        for (int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){

                if(area[i][j] != '#' && !visited[i][j]){
                    bfs(i, j);
                }
            }
        }

        System.out.println(sheep + " " + wolf);
    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;
        int tmpSheep = 0;
        int tmpWolf = 0;

        if(area[x][y] == 'v'){
            tmpWolf++;
        }
        if(area[x][y] == 'k'){
            tmpSheep++;
        }

        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int d = 0; d < 4; d++){
                int nextX = nowX + dx[d];
                int nextY = nowY + dy[d];

                if(nextX >= 0 && nextY >= 0 && nextX < r && nextY < c && !visited[nextX][nextY]){

                    if(area[nextX][nextY] != '#'){

                        visited[nextX][nextY] = true;

                        if(area[nextX][nextY] == 'v'){
                            tmpWolf++;
                        }
                        if(area[nextX][nextY] == 'k'){
                            tmpSheep++;
                        }
                        queue.add(new int[] {nextX, nextY});
                    }

                }
            }
        }

        if(tmpSheep > tmpWolf){
            tmpWolf = 0;
        }
        else{
            tmpSheep = 0;
        }

        wolf += tmpWolf;
        sheep += tmpSheep;

    }
}
