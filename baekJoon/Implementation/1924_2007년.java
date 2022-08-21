package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int inputMonth = Integer.parseInt(st.nextToken());
        int inputDay = Integer.parseInt(st.nextToken());

        int[] dayArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sumDays = 0;
        for(int i = 0; i < inputMonth; i++){
            sumDays += dayArray[i];
        }

        sumDays += inputDay;

        String ans = findAnswerMethod(sumDays % 7);
        System.out.println(ans);

    }

    private static String findAnswerMethod(int findAns) {

        String ans = "";
        switch (findAns) {
            case 0:
                ans = "SUN";
                break;
            case 1:
                ans = "MON";
                break;
            case 2:
                ans = "TUE";
                break;
            case 3:
                ans = "WED";
                break;
            case 4:
                ans = "THU";
                break;
            case 5:
                ans = "FRI";
                break;
            case 6:
                ans = "SAT";
                break;
        }

        return ans;

    }
}
