package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int r, c;
    private static char[][] yard;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int sheep;
    private static int wolf;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        yard = new char[r][c];
        for (int i = 0; i < r; i++){
            String str = br.readLine();
            for(int j = 0; j < c; j++){
                char c = str.charAt(j);
                yard[i][j] = c;
            }
        }



        for (int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(yard[i][j] != '#'){
                    bfs(i, j);
                }
            }
        }

        System.out.println(sheep + " " + wolf);

    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        int tmpSheep = 0;
        int tmpWolf = 0;

        while (!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            if(yard[nowX][nowY] == 'o') {
                tmpSheep++;
                yard[nowX][nowY] = '#';
            }
            else if(yard[nowX][nowY] == 'v') {
                tmpWolf++;
                yard[nowX][nowY] = '#';
            }

            for(int i = 0; i < 4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < r && nextY < c  &&
                        yard[nextX][nextY] != '#'){

                    if(yard[nextX][nextY] == 'o') {
                        tmpSheep++;
                    }
                    else if(yard[nextX][nextY] == 'v') {
                        tmpWolf++;
                    }

                    yard[nextX][nextY] = '#';
                    queue.add(new int[] {nextX, nextY});
                }
            }

        }


        if(tmpSheep > tmpWolf){
            tmpWolf = 0;

        }
        else{
            tmpSheep = 0;
        }

        sheep += tmpSheep;
        wolf += tmpWolf;

    }

}
