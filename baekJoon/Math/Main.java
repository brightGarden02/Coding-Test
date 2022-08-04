package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(T-- > 0) {

            int n = Integer.parseInt(st.nextToken());
            maxVal = Math.max(maxVal, n);
            minVal = Math.min(minVal, n);

        }

        System.out.println(maxVal * minVal);

    }
}