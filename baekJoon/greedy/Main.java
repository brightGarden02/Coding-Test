package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = 2 * n;
        int[] studentsArr = new int[n];
        for(int i = 0; i < n; i++) {
            studentsArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(studentsArr);

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {

            ans = Math.min(ans, studentsArr[i] + studentsArr[n-1-i]);
        }

        System.out.println(ans);
    }
}