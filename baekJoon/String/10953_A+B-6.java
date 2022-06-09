package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){
            String[] arr = br.readLine().split(",");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);

            System.out.println(A+B);
        }

    }
}
