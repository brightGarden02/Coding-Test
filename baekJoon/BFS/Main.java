package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n;
    private static int[][] area;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        area = new int[n][n];
        visited = new boolean[n][n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n; j++){
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(0, 0);

    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        boolean success = false;
        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            visited[nowX][nowY] = true;

            if(area[nowX][nowY] == -1){
                visited[nowX][nowY] = true;
                success = true;
                break;
            }

            int jumpCount = area[nowX][nowY];

            int bottom = nowX + jumpCount;
            int right = nowY + jumpCount;

            
            if (bottom < n && !visited[bottom][nowY]){
                queue.add(new int[] {nowX + jumpCount, nowY});
            }

            if (right < n && !visited[nowX][right]){
                queue.add(new int[] {nowX, nowY + jumpCount});
            }
        }


        if(success){
            System.out.println("HaruHaru");
        }
        else{
            System.out.println("Hing");
        }


    }
}