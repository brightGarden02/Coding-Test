package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n, m;
    private static int[][] paper;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static List<Integer> list = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        paper = new int[m][n];
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int pictures = 0;
        for(int i = 0; i < m; i++){

            for (int j = 0; j < n; j++){
                if(paper[i][j] == 1){
                    bfs(i, j);
                    pictures++;
                }
            }
        }

        if(pictures == 0){
            System.out.println(0);
            System.out.println(0);
        }
        else{
            System.out.println(pictures);
            System.out.println(Collections.max(list));
        }


//        System.out.println("list elements");
//        for (Integer i : list) {
//            System.out.print(i + " ");
//        }
    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        int pictureArea = 0;
        while (!queue.isEmpty()){

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];
            for(int i = 0; i < 4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < m && nextY < n){

                    if(paper[nextX][nextY] == 1){
                        paper[nextX][nextY] = 0;
                        pictureArea++;
                        queue.add(new int[] {nextX, nextY});
                    }
                }
            }

        }

        if(pictureArea == 0){
            list.add(1);
        }
        else{
            list.add(pictureArea);
        }

    }
}
