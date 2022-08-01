package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 7;
        int oddSum = 0;
        int minOdd = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){

            int tmp = Integer.parseInt(br.readLine());
            if(tmp % 2 == 1){
                oddSum += tmp;
                minOdd = Math.min(minOdd, tmp);
            }

        }

        if(oddSum == 0) {
            System.out.println(-1);
        }
        else{
            System.out.println(oddSum);
            System.out.println(minOdd);
        }

    }
}
