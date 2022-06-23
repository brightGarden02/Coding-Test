package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[] dp;
    private static int minVal;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        countNumber(n);

        System.out.println(dp[n]);


    }

    private static void countNumber(int n) {

        for(int i = 2; i <= n; i++){
            minVal = Integer.MAX_VALUE;
            for(int j = 1; j * j <= i; j++){
                minVal = Math.min(minVal, dp[i - j * j]);
            }
            dp[i] = minVal + 1;
        }
    }

}