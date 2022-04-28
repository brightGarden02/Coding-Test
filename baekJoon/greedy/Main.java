package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] array = new Integer[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, Collections.reverseOrder());
        
        int maxLevel = array[0];
        int answer = 0;

        for(int i = 1; i < n; i++){
            answer += maxLevel + array[i];
        }

        System.out.println(answer);

    }
}