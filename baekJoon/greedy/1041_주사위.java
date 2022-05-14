import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long answer = 0;

        long n = Integer.parseInt(br.readLine());
        int[] diceArr = new int[6];
        long[] numsArr = new long[4];

        //1면만 보이는 주사위의 개수
        numsArr[1] = 5 * (n - 2) * (n - 2) + 4 * (n - 2);

        //2면만 보이는 주사위의 개수
        numsArr[2] = 8 * (n - 2) + 4;

        //3면만 보이는 주사위의 개수
        numsArr[3] = 4;

        String[] tmpDiceArr = br.readLine().split(" ");
        for (int i = 0; i < 6; i++){
            diceArr[i] = Integer.parseInt(tmpDiceArr[i]);
        }

        if (n == 1) {
            Arrays.sort(diceArr);
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += diceArr[i];
            }
            System.out.println(sum);
        }

        else {

            //1면이 보이는 주사위의 합
            long minVal = diceArr[0];
            for (int i = 1; i < 6; i++) {
                minVal = Math.min(minVal, diceArr[i]);
            }
            answer += numsArr[1] * minVal;


            //2면이 보이는 주사위의 합
            minVal = Long.MAX_VALUE;
            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {
                    //마주보지만 않을 경우
                    if (j + i != 5) {
                        minVal = Math.min(minVal, diceArr[i] + diceArr[j]);
                    }
                }
            }
            answer += numsArr[2] * minVal;


            //3면이 보이는 주사위의 합
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += Math.min(diceArr[i], diceArr[5 - i]);
            }
            answer += numsArr[3] * sum;

            System.out.println(answer);
        }

    }
}
