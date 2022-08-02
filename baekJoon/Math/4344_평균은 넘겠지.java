package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            int sum = 0;
            for(int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            double avg = sum / n;

            double moreThanAvgStudents = 0.0;
            for(int j = 0; j < n; j++){
                if(avg < arr[j]){
                    moreThanAvgStudents++;
                }
            }

            double answer = moreThanAvgStudents / n;
            System.out.printf("%.3f%%\n", (answer * 100));

        }

    }
}
