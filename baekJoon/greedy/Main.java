package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int candies = Integer.parseInt(st.nextToken());
            int boxes = Integer.parseInt(st.nextToken());
            Integer[] boxesArr = new Integer[boxes];

            for(int j = 0; j < boxesArr.length; j++){
                StringTokenizer len = new StringTokenizer(br.readLine());
                int R = Integer.parseInt(len.nextToken());
                int C = Integer.parseInt(len.nextToken());

                boxesArr[j] = R*C;
            }
            Arrays.sort(boxesArr, Collections.reverseOrder());
            int maxCandies = boxesArr[0];

            int answer = 1;
            while(candies > maxCandies){

                maxCandies += boxesArr[answer];
                answer++;
            }
            System.out.println(answer);

        }

    }

}