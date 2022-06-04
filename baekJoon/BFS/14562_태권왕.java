package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());
        while(C-- > 0){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());

            int count = 0;
            System.out.println(recursion(S, T, count));

        }


    }

    private static int recursion(int s, int t, int count) {

        if(s > t){
            return 100;
        }

        if(s == t){
            return count;
        }
        else{

            int min1 = recursion(s*2, t+3, count+1);
            int min2 = recursion(s+1, t, count+1);
            return Math.min(min1, min2);
        }

    }
}
