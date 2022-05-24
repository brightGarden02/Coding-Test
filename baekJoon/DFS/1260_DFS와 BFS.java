package ex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static  int[][] check;
    static boolean[] visit;
    static int n;
    static int m;
    static int start;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        check = new int[1001][1001];
        visit = new boolean[1001];


        while(m > 0){

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            check[a][b] = 1;
            check[b][a] = 1;
            m--;
        }

        DFS(start);

        visit = new boolean[1001];
        System.out.println();

        BFS();

    }

    private static void BFS() {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = true;
        System.out.print(start + " ");

        while(!queue.isEmpty()){

            int temp = queue.poll();

            for(int j = 1; j <= n; j++){

                if(check[temp][j] == 1 && visit[j] == false){
                    queue.offer(j);
                    visit[j] = true;
                    System.out.print(j + " ");
                }
            }

        }

    }


    private static void DFS(int i) {

        visit[i] = true;
        System.out.print(i + " ");

        for(int j = 1; j <= n; j++){
            if(check[i][j] == 1 && visit[j] == false){
                DFS(j);
            }
        }

    }
}
