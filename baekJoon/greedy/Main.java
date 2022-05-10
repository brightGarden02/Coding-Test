package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        int[] arr = new int[1000002];
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int balloonsHeight = 0;
        for(int i = 0; i < n; i++){

            balloonsHeight = Integer.parseInt(st.nextToken());

            // balloonHeight + 1 높이로 날아가는 화살이 없는 경우
            // 해당 높이에서 날아가는 화살 추가, 화살 개수 추가
            if(arr[balloonsHeight + 1] == 0){
                arr[balloonsHeight]++;
                answer++;
            }

            // balloonHeight + 1 높이로 날아가는 화살이 있는 경우 높이가 1감소
            else if(arr[balloonsHeight + 1] != 0){
                arr[balloonsHeight + 1]--;
                arr[balloonsHeight]++;
            }

        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}