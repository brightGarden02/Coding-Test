import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int tmpN = N;
        int M = Integer.parseInt(st.nextToken());

        int[] P = new int[M];
        for(int i = 0; i < M; i++){
            P[i] = Integer.parseInt(br.readLine());
        }

        int numbers = M;

        Arrays.sort(P);
        int profit = 0;
        int maxProfit = Integer.MIN_VALUE;
        int minCost = 0;
        for(int i = 0; i < M; i++){

            profit = P[i] * numbers;
            tmpN = N;
            tmpN -= numbers;
            if(profit >= maxProfit && tmpN >= 0){
                maxProfit = profit;
                minCost = P[i];
            }
            numbers--;
        }

        System.out.println(minCost + " " + maxProfit);

    }
}
