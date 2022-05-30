package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n, m;
    private static List<Integer> list[];
    private static boolean[] visited;

    private static int destination, distance, count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];
        for (int i = 0; i <= n; i++){
            list[i] = new ArrayList<>();
        }

        visited = new boolean[n+1];

        while(m-- > 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        bfs();

        System.out.println(destination + " " + distance + " " + count);
    }

    private static void bfs() {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {1, 0});
        visited[1] = true;

        while(!queue.isEmpty()){

            int[] arr = queue.poll();
            int now = arr[0];
            int next = arr[1];

            if(next > distance){
                distance = next;
                destination = now;
                count = 1;
            }
            else if(next == distance){

                if(destination > now){
                    destination = now;
                }
                count++;
            }

            for(int i = 0; i < list[now].size(); i++){
                int next_next = list[now].get(i);

                if(!visited[next_next]){
                    visited[next_next] = true;
                    queue.add(new int[] {next_next, next+1});

                }
            }
        }


    }
}
