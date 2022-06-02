package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int N, k;
    private static int[][] area;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        area = new int[2][N];

        for (int i = 0; i < 2; i++){
            String tmp = br.readLine();
            for(int j = 0; j < N; j++){
                area[i][j] = tmp.charAt(j) - '0';
            }
        }


        if(bfs()){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    private static boolean bfs() {

        boolean visited[][] = new boolean[2][N];
        int[] jumpC = {-1, 1, k};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()){

            int[] cur = queue.poll();

            for(int i = 0; i < 3; i++){
                int nextC = cur[1] + jumpC[i];
                int nextR = cur[0];
                int time = cur[2];

                if(i == 2){
                    if(cur[0] == 1){
                        nextR = 0;
                    }
                    else{
                        nextR = 1;
                    }
                }

                if(nextC >= N){
                    return true;
                }

                if(nextC <= time) continue;
                if(visited[nextR][nextC]) continue;
                if (area[nextR][nextC] == 0) continue;

                visited[nextR][nextC] = true;
                queue.add(new int[] {nextR, nextC, time+1});
            }

        }

        return false;
    }
}