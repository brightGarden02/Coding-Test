package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    private static int gsShops, homeX, homeY, destinationX, destinationY;
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {

            gsShops = Integer.parseInt(br.readLine());
            List<int []> gsShopsList = new ArrayList<>();

            String[] home = br.readLine().split(" ");
            homeX = Integer.parseInt(home[0]);
            homeY = Integer.parseInt(home[1]);


            for (int i = 0; i < gsShops; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                gsShopsList.add(new int[]{x, y});
            }

            String[] destination = br.readLine().split(" ");
            destinationX = Integer.parseInt(destination[0]);
            destinationY = Integer.parseInt(destination[1]);

            if (bfs(gsShopsList)) {
                System.out.println("happy");
            } else {
                System.out.println("sad");
            }

        }
    }

    private static boolean bfs(List<int []> gsShopsList) {

        Queue<int []> queue = new LinkedList<>();
        boolean[] visited = new boolean[gsShops];
        queue.add(new int[] {homeX, homeY});

        while(!queue.isEmpty()) {

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            if(Math.abs(nowX - destinationX ) + Math.abs(nowY - destinationY ) <= 1000){
                return true;
            }

            for(int i = 0; i < gsShops; i++){

                if(!visited[i]){

                    int nextX = gsShopsList.get(i)[0];
                    int nextY = gsShopsList.get(i)[1];

                    if(Math.abs(nowX - nextX) + Math.abs(nowY - nextY) <= 1000){
                        visited[i] = true;
                        queue.add(new int[] {nextX, nextY});
                    }
                }
            }

        }

        return false;
    }
}
