package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int avg = 0;
        int n = 5;
        for(int i = 0; i < n; i++){
            int tmp = Integer.parseInt(br.readLine());

            if(tmp < 40) tmp = 40;

            sum += tmp;
        }

        avg = sum / n;

        System.out.println(avg);

    }
}

