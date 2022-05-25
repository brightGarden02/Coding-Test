package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n;
    private static int[][] network;
    private static boolean[] visited;
    private static int count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        network = new int[n+1][n+1];
        visited = new boolean[n+1];

        int m = Integer.parseInt(br.readLine());

        while(m > 0){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            network[a][b] = 1;
            network[b][a] = 1;
            m--;
        }

        bfs(1);
        for (int i = 1; i <= n; i++){
            if(visited[i]){
                count++;
            }
        }

        count--;
        System.out.println(count);
    }

    private static void bfs(int i) {

        Queue<Integer> queue = new LinkedList<>();
        visited[i] = true;
        queue.add(i);

        while(!queue.isEmpty()){

            int tmp = queue.poll();
            for(int j = 1; j <= n; j++){

                if(network[tmp][j] == 1 && !visited[j]){
                    queue.add(j);
                    visited[j] = true;
                }
            }

        }


    }
}
