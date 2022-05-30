package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n, startX, startY, destinationX, destinationY;
    private static boolean[][] chess;
    private static int[] dx = {-2, -2, 0, 0, 2, 2};
    private static int[] dy = {-1, 1, 2, -2, 1, -1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        chess = new boolean[n][n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        startX = Integer.parseInt(st.nextToken());
        startY = Integer.parseInt(st.nextToken());
        destinationX = Integer.parseInt(st.nextToken());
        destinationY = Integer.parseInt(st.nextToken());

        bfs();
    }

    private static void bfs() {

        Queue<Knight> queue = new LinkedList<>();
        queue.add(new Knight(startX, startY, 0));
        chess[startX][startY] = true;

        while(!queue.isEmpty()){

            Knight knight = queue.poll();
            for(int i = 0; i < 6; i++){
                int nextX = knight.x + dx[i];
                int nextY = knight.y + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n
                    &&!chess[nextX][nextY]){

                    if(nextX == destinationX && nextY == destinationY){

                        System.out.println(knight.count +1);
                        return;
                    }

                    chess[nextX][nextY] = true;
                    queue.add(new Knight(nextX, nextY, knight.count + 1));
                }
            }
        }

        System.out.println(-1);

    }
}

class Knight {

    int x, y, count;

    public Knight(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}