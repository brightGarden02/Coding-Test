import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int bae1 = 0;
        int bae2 = 0;
        int sum1 = 0;
        for(int i = 1; i < n; i++){
            bae1 += arr[i];
        }
        for(int i = 2; i < n; i++){
            bae2 += arr[i];
        }
        for(int i = 1; i < n-1; i++){

            sum1 = Math.max(sum1, (bae1 - arr[i]) + bae2);
            bae2 -= arr[i+1];

        }


        bae1 = 0;
        bae2 = 0;
        int sum2 = 0;
        for(int i = n-2; i >= 0; i--){
            bae1 += arr[i];
        }
        for(int i = n-3; i >= 0; i--){
            bae2 += arr[i];
        }
        for(int i = n-2; i > 0; i--){
            sum2 = Math.max(sum2, (bae1 - arr[i]) + bae2);
            bae2 -= arr[i-1];
        }
        ans = Math.max(sum1, sum2);


        bae1 = 0;
        bae2 = 0;
        int sum3 = 0;
        for(int i = 1; i < n-1; i++){
            bae2 += arr[i];
        }
        for(int i = 1; i < n-1; i++){

            bae1 += arr[i];
            sum3 = Math.max(sum3, bae1 + bae2);
            bae2 -= arr[i];

        }
        ans = Math.max(ans, sum3);


        System.out.println(ans);
    }
}
