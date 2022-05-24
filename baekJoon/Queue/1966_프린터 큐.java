package ex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int count = 0;

            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
            }


            while(true){

                int[] now = queue.remove();
                boolean flag = true;

                for(int[] q : queue){
                    if(q[1] > now[1]){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    count++;
                    if(now[0] == m){
                        break;
                    }
                }
                else{
                    queue.add(now);
                }

            }

            System.out.println(count);
        }

    }
}
