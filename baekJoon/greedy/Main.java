package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int ans = Math.abs(A-B);
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            int buttons = Integer.parseInt(br.readLine());

            ans = Math.min(ans, Math.abs(buttons - B) + 1);

        }

        System.out.println(ans);

    }
}