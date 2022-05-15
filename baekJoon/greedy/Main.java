package codingTest;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for(int i = n; i >= 0; i--){
            int A = i;
            int B = n - i;

            if(A * B < k) continue;

            int count = 0;

            int temp = k;

            for(int j = B; j >= 0; j--){

                for(int a = i; a >= 0; a--){


                    if(temp > a * j){
                        temp -= a * j;
                        for(int t = 0; t < a; t++){
                            sb.append("A");
                            count++;
                        }
                        sb.append("B");
                        count++;
                        break;

                    } else if(temp == a * j){

                        temp -= a * j;
                        for(int t = 0; t < a; t++){
                            sb.append("A");
                            count++;
                        }
                        for(int t = 0; t < j; t++){
                            sb.append("B");
                            count++;
                        }
                        break;
                    }
                }

                if(temp == 0) {

                    while(count < n){
                        sb.append("A");
                        count++;
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }

        System.out.println(-1);

    }
}