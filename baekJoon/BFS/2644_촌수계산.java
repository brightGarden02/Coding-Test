package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n, p1, p2;
    private static int[][] map;
    private static int[] distance;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        while(m-- > 0){

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = 1;
            map[y][x] = 1;
        }

        distance = new int[n+1];
        bfs(p1, p2);

        if(distance[p2] == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(distance[p2]);
        }

    }

    private static void bfs(int start, int end) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){

            int tmp = queue.poll();
            if(tmp == end){
                break;
            }

            for(int i = 1; i <= n; i++){

                if(map[tmp][i] == 1 && distance[i] == 0){
                    distance[i] = distance[tmp] + 1;
                    queue.add(i);
                }
            }

        }

    }
}
