package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n, startX, startY, destinationX, destinationY;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){

            n = Integer.parseInt(br.readLine());
            List<int[]> list = new ArrayList<>();
            for(int j = 0; j < n+2; j++){

                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if(j == 0){
                    startX = x;
                    startY = y;
                }
                else if(j == n+1){
                    destinationX = x;
                    destinationY = y;
                }
                else{
                    list.add(new int[] {x, y});
                }

            }

            if(bfs(list)){
                System.out.println("happy");
            }
            else{
                System.out.println("sad");
            }
        }

    }

    private static boolean bfs(List<int[]> list) {

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(new int[] {startX, startY});

        while (!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            if(Math.abs(nowX - destinationX) + Math.abs(nowY - destinationY) <= 1000){
                return true;
            }

            for(int i = 0; i < n; i++){

                if(!visited[i]){

                    int nextX = list.get(i)[0];
                    int nextY = list.get(i)[1];
                    int distance = Math.abs(nowX - nextX) + Math.abs(nowY - nextY);

                    if(distance <= 1000){
                        visited[i] = true;
                        queue.add(new int[] {nextX, nextY});
                    }
                }
            }
        }

        return false;
    }
}