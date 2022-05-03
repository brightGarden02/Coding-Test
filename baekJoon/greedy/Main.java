package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int buyBottles = 0;
        while(true){

            char[] arr= Integer.toBinaryString(n).toCharArray();
            int bottles = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == '1') bottles++;
            }

            if(bottles <= k){
                System.out.println(buyBottles);
                break;
            }
            n++;
            buyBottles++;

        }


    }
}