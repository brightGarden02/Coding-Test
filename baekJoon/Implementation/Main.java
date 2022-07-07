package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean[] isConstructor = new boolean[10001];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 1; i <= 10000; i++){
            isConstructor[i] = true;
        }

        for(int i = 1; i <= 10000; i++){
            d(i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10000; i++){
            if(isConstructor[i]){
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);

    }

    private static void d(int num){

        int val = num;
        while(num > 0){

            int r = num % 10;
            num = num / 10;
            val += r;
        }

        if(val <= 10000){
            isConstructor[val] = false;
        }
    }
}