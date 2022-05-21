package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while(count != n){

            num++;
            if(Integer.toString(num).contains("666")){
                count++;
            }
        }

        System.out.println(num);

    }
}