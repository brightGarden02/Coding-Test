package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] miro;
    private static int n;
    private static int[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        miro = new int[n+1];
        visited = new int[n+1];
        Arrays.fill(visited, Integer.MAX_VALUE);


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            miro[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(bfs());
    }

    private static int bfs() {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = 0;

        while(!queue.isEmpty()){

            int curIdx = queue.poll();
            for(int i = 1; i <= miro[curIdx]; i++){

                int nextIdx = curIdx + i;
                if(nextIdx > n){
                    break;
                }

                if(visited[nextIdx] > visited[curIdx] + 1){
                    visited[nextIdx] = visited[curIdx] + 1;
                    queue.add(nextIdx);
                }

            }

        }

        if (visited[n] == Integer.MAX_VALUE) return -1;
        else return visited[n];

    }
}
