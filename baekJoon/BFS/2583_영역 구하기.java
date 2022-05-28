package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static boolean[][] visit;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int m, n;
    private static List<Integer> list = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        visit = new boolean[m][n];

        while(k-- > 0){

            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());


            for(int i = y2-1; i >= y1; i--){
                for(int j = x1; j < x2; j++){

                    if(visit[i][j]){
                        continue;
                    }
                    else{
                        visit[i][j] = true;
                    }
                }
            }

        }

        int seperatedArea = 0;
        for(int i = m-1; i >= 0; i--){
            for(int j = 0; j < n; j++){

                if(!visit[i][j]){
                    bfs(i, j);
                    seperatedArea++;
                }
            }
        }

        System.out.println(seperatedArea);
        Collections.sort(list);
        for(int i : list){
            System.out.print(i + " ");
        }

    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visit[x][y] = true;

        int areas = 1;
        while(!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i = 0; i < 4; i++){

                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < m && nextY < n){

                    if(!visit[nextX][nextY]){
                        visit[nextX][nextY] = true;
                        queue.add(new int[] {nextX, nextY});
                        areas++;
                    }

                }

            }

        }
        list.add(areas);

    }
}
