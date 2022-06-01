package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int A, B, start, end, answer;
    private static boolean[] visited = new boolean[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        bfs();
        System.out.println(answer);

    }

    private static void bfs() {

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(start, 0));
        visited[start] = true;
        while(!queue.isEmpty()){

            Point p = queue.poll();

            if(p.x == end){
                answer = p.cnt;
                return;
            }

            if(p.x + 1 < 100001 && !visited[p.x + 1]){

                visited[p.x + 1] = true;
                queue.add(new Point(p.x + 1, p.cnt + 1));
            }
            if(p.x - 1 >= 0 && !visited[p.x - 1]){

                visited[p.x - 1] = true;
                queue.add(new Point(p.x - 1, p.cnt + 1));
            }
            if(p.x + A < 100001 && !visited[p.x + A]){

                visited[p.x + A] = true;
                queue.add(new Point(p.x + A, p.cnt + 1));
            }
            if(p.x + B < 100001 && !visited[p.x + B]){

                visited[p.x + B] = true;
                queue.add(new Point(p.x + B, p.cnt + 1));
            }
            if(p.x - A >= 0 && !visited[p.x - A]){

                visited[p.x - A] = true;
                queue.add(new Point(p.x - A, p.cnt + 1));
            }
            if(p.x - B >= 0 && !visited[p.x - B]){

                visited[p.x - B] = true;
                queue.add(new Point(p.x - B, p.cnt + 1));
            }
            if(p.x * A < 100001 && !visited[p.x * A]){

                visited[p.x * A] = true;
                queue.add(new Point(p.x * A, p.cnt + 1));
            }
            if(p.x * B < 100001 && !visited[p.x * B]){

                visited[p.x * B] = true;
                queue.add(new Point(p.x * B, p.cnt + 1));
            }
        }
    }
}

class Point{
    int x, cnt;

    public Point(int x, int cnt) {
        this.x = x;
        this.cnt = cnt;
    }
}
