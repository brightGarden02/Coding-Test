package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[] count = new int[101];
    private static int[] move = new int[101];
    private static boolean[] visited = new boolean[101];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n + m; i++){
            st = new StringTokenizer(br.readLine());
            int position1 = Integer.parseInt(st.nextToken());
            int position2 = Integer.parseInt(st.nextToken());
            move[position1] = position2;
        }

        bfs();
    }

    private static void bfs() {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        count[1] = 0;
        visited[1] = true;

        while(!q.isEmpty()){

            int curPosition = q.poll();
            if(curPosition == 100){
                System.out.println(count[curPosition]);
                return;
            }

            for(int i = 1; i < 7; i++){

                int p1 = curPosition + i;
                if(p1 > 100) continue;
                if(visited[p1]) continue;
                visited[p1] = true;

                if(move[p1] != 0){

                    int p2 = move[p1];
                    if(!visited[p2]){

                        visited[p2] = true;
                        q.add(p2);
                        count[p2] = count[curPosition] + 1;
                    }
                }
                else{
                    q.add(p1);
                    count[p1] = count[curPosition] + 1;
                }

            }
        }

    }
}
