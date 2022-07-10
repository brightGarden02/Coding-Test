package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[10];

        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i) - '0';
            arr[num]++;
        }

        arr[6] += arr[9];
        arr[9] = 0;

        int maxCount1 = -1;
        for(int i = 0; i < arr.length; i++){
            if(i != 6 && maxCount1 < arr[i]){
                maxCount1 = arr[i];
            }
        }

        int q = arr[6] / 2;
        int r = arr[6] % 2;

        int maxCount2 = q + r;

        System.out.println(Math.max(maxCount1, maxCount2));

    }
}