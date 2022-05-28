package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n, m, k, startNum;
    private static List<List<Integer>> list = new ArrayList<>();
    private static int[] distance;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        startNum = Integer.parseInt(st.nextToken());

        distance = new int[300001];
        for (int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
            distance[i] = -1;
        }

        while (m-- > 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
        }


        bfs(startNum);

        boolean check = false;
        for(int i = 1; i <= n; i++){
            if(distance[i] == k){
                System.out.println(i);
                check = true;
            }
        }

        if(!check){
            System.out.println(-1);
        }

    }

    private static void bfs(int startNum) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNum);
        distance[startNum] = 0;

        while (!queue.isEmpty()){

            int now = queue.poll();
            for(int i = 0; i < list.get(now).size(); i++){

                int next = list.get(now).get(i);

                if(distance[next] == -1){
                    distance[next] = distance[now] + 1;
                    queue.add(next);
                }
            }

        }

    }
}
