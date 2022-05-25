package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int N;
    private static int K;

    private static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int result = bfs(N);
        System.out.println(result);
    }

    private static int bfs(int current) {

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(current);
        int index = current;
        int n = 0;
        visited[index] = 1;
        while(!queue.isEmpty()) {

            n = queue.remove();
            if (n == K) {
                return visited[n]-1;
            }

            if (n-1 >= 0 && visited[n-1] == 0) {
                visited[n-1] = visited[n] + 1;
                queue.add(n-1);
            }
            if (n+1 <= 100000 && visited[n+1] == 0) {
                visited[n+1] = visited[n] + 1;
                queue.add(n+1);
            }
            if (2*n <= 100000 && visited[2*n] == 0) {
                visited[2*n] = visited[n] + 1;
                queue.add(2*n);
            }
        }
        return -1;
    }
}
