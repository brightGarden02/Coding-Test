package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[][] direction = {{0, 1, 3}, {0, 1, 2, 4}, {1, 2, 5}, {0, 3, 4, 6},
            {1, 3, 4, 5, 7}, {2, 4, 5, 8}, {3, 6, 7}, {4, 6, 7, 8}, {5, 7, 8}};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            String str = "";
            for (int i = 0; i < 3; i++) {
                String tmp = br.readLine();
                for (int j = 0; j < 3; j++) {
                    char c = tmp.charAt(j);
                    if(c == '*'){
                        str += "1";
                    }
                    else{
                        str += "0";
                    }
                }
            }

            if(str.equals("000000000")){
                System.out.println(0);
            }
            else{
                System.out.println(bfs(str));
            }

        }
    }

    private static int bfs(String str) {

        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>();

        queue.add("000000000");
        set.add("000000000");
        int time = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();
            while (size-- > 0){

                String here = queue.poll();
                for(int i = 0; i < 9; i++){
                    String next = here;
                    for(int j = 0; j < direction[i].length; j++){

                        if(next.charAt(direction[i][j]) == '1'){
                            next = next.substring(0, direction[i][j]) + '0' + next.substring(direction[i][j] + 1, 9);
                        }
                        else{
                            next = next.substring(0, direction[i][j]) + '1' + next.substring(direction[i][j] + 1, 9);
                        }
                    }

                    if(set.contains(next)){
                        continue;
                    }

                    if(str.equals(next)){
                        return time;
                    }
                    queue.add(next);
                    set.add(next);

                }

            }
            time++;

        }

        return time;
    }
}