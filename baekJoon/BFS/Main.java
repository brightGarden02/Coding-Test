package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int N, M, R;
    private static List<Integer> list[];
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        for (int i = 1; i <= N; i++){
            list[i] = new ArrayList<>();
        }

        visited = new boolean[N+1];

        while(M-- > 0){

            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list[u].add(v);
            list[v].add(u);
        }

        for (int i = 1; i <= N; i++){
            Collections.sort(list[i]);
        }

        bfs(R);

    }

    private static void bfs(int start) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        int cnt = 0;
        int[] order = new int[N+1];
        while (!queue.isEmpty()){

            int now = queue.poll();
            cnt++;
            order[now] = cnt;

            for(int i : list[now]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        for (int i = 1; i <= N; i++){
            System.out.println(order[i]);
        }

    }
}