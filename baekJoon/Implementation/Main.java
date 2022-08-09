package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int startNum = Integer.parseInt(br.readLine());
        int endNum = Integer.parseInt(br.readLine());

        int sum = 0;
        int minNum = Integer.MAX_VALUE;
        for(int i = startNum; i <= endNum; i++){

            int num = (int) Math.sqrt(i);
            if(num * num == i) {
                sum += i;
                minNum = Math.min(minNum, i);
            }
        }

        if(minNum == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(minNum);
        }

    }
}