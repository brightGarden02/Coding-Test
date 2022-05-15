package codingTest;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int s = Integer.parseInt(br.readLine());
        for(int i = 0; i < n && s > 0; i++){

            int maxVal = Integer.MIN_VALUE;
            int maxValIdx = -1;
            for(int j = i; j < n && j <= i+s; j++){

                if(maxVal < arr[j]){
                    maxVal = arr[j];
                    maxValIdx = j;
                }
            }

            for(int j = maxValIdx; j > i; j--){
                int tmp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = tmp;
                s--;
            }

        }

        for(int i : arr){
            System.out.print(i + " ");
        }


    }
}