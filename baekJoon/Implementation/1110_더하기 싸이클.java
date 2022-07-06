package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int copy_n = n;
        int ans = 0;

        while(true) {

            int q = n / 10;
            int r = n % 10;
            int sum = q + r;

            int sum_r = sum % 10;

            n = r * 10 + sum_r;

            ans++;
            if(n == copy_n){
                System.out.println(ans);
                return;
            }
        }

    }
}
