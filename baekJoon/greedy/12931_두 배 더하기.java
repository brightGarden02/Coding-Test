import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] B = new int[n];
        for(int i = 0; i < n; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        int twoCounts = 0;
        int minTwoCounts = Integer.MAX_VALUE;
        int oneCounts = 0;


        while(true){

            boolean allZero = true;
            boolean minusOne = false;

            for(int i = 0; i < n; i++){

                if(B[i] != 0) allZero = false;

                if(B[i] % 2 != 0){
                    minusOne = true;
                    B[i] = B[i] - 1;
                    answer++;
                }
            }

            if(allZero == true) break;

            if(minusOne == false){
                for(int j = 0; j < n; j++){
                    B[j] = B[j] / 2;
                }
                answer++;
            }


//            for(int i = 0; i < n; i++){
//                System.out.print(B[i] + " ");
//            }
//            System.out.println();

        }

        bw.write(answer + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
