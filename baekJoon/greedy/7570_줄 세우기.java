package ex;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        // dp[i] = dp[i - 1] + 1;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            dp[k] = dp[k - 1] + 1;
        }

        Arrays.sort(dp);

        System.out.println(n - dp[n]);
    }
}
