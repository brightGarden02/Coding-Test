package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Integer[] dp;
    private static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N+1];
        arr = new int[N+1];

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[1];

        if(N >= 2){
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(stairs(N));

    }

    private static int stairs(int N){

        if(dp[N] == null){
            dp[N] = Math.max(stairs(N-2), stairs(N-3) + arr[N-1]) + arr[N];
        }

        return dp[N];
    }
}
