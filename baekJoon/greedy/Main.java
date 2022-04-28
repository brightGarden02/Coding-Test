package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int dasom = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < n-1; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(n == 1 ){
            System.out.println(0);
            return;
        }

        int j = 1;
        while(true){

            boolean flag = true;
            Arrays.sort(arr);
            int last = arr.length-1;
            if(dasom <= arr[last]){

                arr[last]--;
                dasom++;
                answer++;
                flag = false;
            }

            if(flag){
                break;
            }

        }

        System.out.println(answer);

    }


}