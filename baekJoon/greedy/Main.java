package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] diffDis = new int[n-1];
        for(int i = 0; i < n-1; i++){
            diffDis[i] = arr[i+1] - arr[i];
        }

        Arrays.sort(diffDis);
        int answer = 0;
        for(int i = 0; i < n-k; i++){
            answer += diffDis[i];
        }

        for(int i = n-k; i < n-1; i++){
            answer++;
        }

        answer++;
        System.out.println(answer);
    }
}