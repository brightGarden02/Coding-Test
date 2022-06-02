package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[] road;
    private static boolean[] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static int N, A, B, count;
    private static boolean reached;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        road = new int[N + 1];
        visited = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        System.out.println(bfs());
    }


    private static int bfs() {

        Queue<Jump> queue = new LinkedList<>();
        queue.add(new Jump(A, 0));
        visited[A] = true;

        while(!queue.isEmpty()) {

            Jump jump = queue.poll();

            if(jump.idx == B) {
                return jump.cnt;
            }

            int now = 1;

            while(true) {
                int val = now * road[jump.idx];

                int rightJumpedIdx = val + jump.idx;
                if(rightJumpedIdx > N) break;
                if(!visited[rightJumpedIdx]) {
                    visited[rightJumpedIdx] = true;
                    queue.add(new Jump(rightJumpedIdx, jump.cnt+1));
                }
                now++;
            }

            now = 1;
            while(true) {
                int val = now * road[jump.idx];

                int leftJumpedIdx = jump.idx - val;
                if(leftJumpedIdx <= 0) break;
                if(!visited[leftJumpedIdx]) {
                    visited[leftJumpedIdx] = true;
                    queue.add(new Jump(leftJumpedIdx, jump.cnt+1));
                }
                now++;
            }
        }

        return -1;
    }
}

class Jump{

    int idx, cnt;

    public Jump(int idx, int cnt) {
        this.idx = idx;
        this.cnt = cnt;
    }
}

