package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private final static int Red = 0;
    private final static int Green = 1;
    private final static int Blue = 2;

    private static int[][] cost;
    private static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        cost = new int[N][3];
        dp = new int[N][3];


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            cost[i][Red] = Integer.parseInt(st.nextToken());
            cost[i][Green] = Integer.parseInt(st.nextToken());
            cost[i][Blue] = Integer.parseInt(st.nextToken());

        }

        dp[0][Red] = cost[0][Red];
        dp[0][Green] = cost[0][Green];
        dp[0][Blue] = cost[0][Blue];

        int minColor = Math.min(PaintColor(N-1, Red), PaintColor(N-1, Green));
        int answer = Math.min(minColor, PaintColor(N-1, Blue));
        System.out.println(answer);
    }

    private static int PaintColor(int N, int color) {

        if(dp[N][color] == 0){

            if(color == Red){
                dp[N][Red] = Math.min(PaintColor(N-1, Green), PaintColor(N-1, Blue)) + cost[N][Red];
            }
            else if(color == Green){
                dp[N][Green] = Math.min(PaintColor(N-1, Red), PaintColor(N-1, Blue)) + cost[N][Green];
            }
            else{
                dp[N][Blue] = Math.min(PaintColor(N-1, Red), PaintColor(N-1, Green)) + cost[N][Blue];
            }
        }

        return dp[N][color];
    }
}
