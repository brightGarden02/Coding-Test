package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long answer = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while(left < right){

            if(arr[left] < 1 && arr[left + 1] < 1){
                answer += arr[left] * arr[left + 1];
            }
            else{
                break;
            }
            left += 2;
        }

        while(right > 0){

            if(arr[right] > 1 && arr[right-1] > 1){
                answer += arr[right] * arr[right - 1];
            }
            else{
                break;
            }
            right -= 2;
        }

        while(left <= right){

            answer += arr[right];
            right--;
        }

        System.out.println(answer);
    }
}