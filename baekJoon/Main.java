package ex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long max = arr[k-1];
        long min = 1;
        long mid = 0;


        while(min <= max){


            mid = (max + min) / 2;
            long allCount = 0;

            for(int j = 0; j < arr.length; j++){
                allCount += arr[j] / mid;
            }


            if(allCount >= n){
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }

        }

        System.out.println(max);

    }
}