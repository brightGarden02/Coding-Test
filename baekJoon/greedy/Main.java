package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        long sum1 = 0, sum2 = 0;
        for(int i = 0; i < n/2; i++){
            sum1 += arr[i];
        }
        for(int i = n/2; i < n; i++){
            sum2 += arr[i];
        }

        long ans = 0;
        ans += sum1 * sum2;

        for(int i = n/2 - 1; i > 0; i--){
            ans += (sum1 - arr[i]) * arr[i];
            sum1 -= arr[i];
        }

        for(int i = n - 1; i > n/2; i--){
            ans += (sum2 - arr[i]) * arr[i];
            sum2 -= arr[i];
        }

        System.out.println(ans);

    }
}