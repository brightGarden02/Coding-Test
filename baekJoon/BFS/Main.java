package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[][] chess;
    private static boolean[][] visited;
    private static int[] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
    private static int[] dy = {1, -1, -2, -2, -1, 1, 2, 2};
    private static int n, startX, startY, destinationX, destinationY;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){

            n = Integer.parseInt(br.readLine());
            chess = new int[n][n];
            visited = new boolean[n][n];

            st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            destinationX = Integer.parseInt(st.nextToken());
            destinationY = Integer.parseInt(st.nextToken());

            bfs();

        }

    }

    private static void bfs() {

        Queue<Knight> queue = new LinkedList<>();

        queue.add(new Knight(startX, startY, 0));
        visited[startX][startY] = true;

        if(startX == destinationX && startY == destinationY){
            System.out.println(0);
            return;
        }

        while(!queue.isEmpty()){

            Knight k = queue.poll();
            int nowX = k.x;
            int nowY = k.y;

            for(int d = 0; d < 8; d++){
                int nextX = nowX + dx[d];
                int nextY = nowY + dy[d];

                if(nextX == destinationX && nextY == destinationY){
                    System.out.println(k.cnt + 1);
                    return;
                }

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n
                 && !visited[nextX][nextY]){

                    visited[nextX][nextY] = true;
                    queue.add(new Knight(nextX, nextY, k.cnt + 1));
                }

            }

        }
    }
}

class Knight{
    int x, y, cnt;

    public Knight(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
