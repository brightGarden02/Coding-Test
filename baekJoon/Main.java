package ex;

import com.sun.jdi.IntegerType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int)Math.pow(2, N);

        find(size, r, c);
        System.out.println(count);

    }

    private static void find(int size, int r, int c) {

        int halfSize = size/2;

        if(size == 1){
            return;
        }

        //r, c가 1사분면에 속할 경우
        if(r < halfSize && c < halfSize){
            find(halfSize, r, c);
        }
        //r, c가 2사분면에 속할 경우
        else if(r < halfSize && c >= halfSize){
            count += (size * size) / 4;
            find(halfSize, r, c - halfSize);
        }
        //r, c가 3사분면에 속할 경우
        else if(r >= halfSize && c < halfSize){
            count += (size * size / 4) * 2;
            find(halfSize, r - halfSize, c);
        }
        //r, c가 4사분면에 속할 경우
        else{
            count += (size * size / 4) * 3;
            find(halfSize, r - halfSize, c - halfSize);
        }


    }
}