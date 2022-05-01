package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long W = Integer.parseInt(st.nextToken());
        int[] priceArr = new int[n];
        for(int i = 0; i < n; i++) {
            priceArr[i] = Integer.parseInt(br.readLine());
        }
        long coins = 0;


        for(int i = 0; i < n-1; i++) {

            if(priceArr[i] < priceArr[i+1]){

                coins += W / priceArr[i];

                System.out.println("BUY-> W:" + W + ", coins: " + coins +
                        " priceArr[" + i + "]: " + priceArr[i] +
                        " priceArr[" + (i+1) + "]: " + priceArr[i+1]
                );
                W = W % priceArr[i];

            }
            else if(priceArr[i] > priceArr[i+1]){

                W += coins * priceArr[i];
                coins = 0;
                System.out.println("SELL-> W:" + W + ", coins: " + coins +
                        " priceArr[" + i + "]: " + priceArr[i] +
                        " priceArr[" + (i+1) + "]: " + priceArr[i+1]
                );

            }

            System.out.println("RESULT-> W:" + W + ", coins: " + coins);
            System.out.println();
        }

        if(coins > 0){
            W += coins * priceArr[n-1];
            coins = 0;
        }

        System.out.println(W);
    }
}