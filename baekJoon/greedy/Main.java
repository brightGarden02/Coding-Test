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

        int treeHeightSum = 0;
        int twoWaterDays = 0;

        int twoWater = 0;
        for(int i = 0; i < n; i++){
            int t = Integer.parseInt(st.nextToken());

            treeHeightSum += t;
            twoWaterDays += t/2;

        }


        if(treeHeightSum % 3 != 0){
            System.out.println("NO");
        }
        else{
            int totalWaterDays = treeHeightSum / 3;
            if(twoWaterDays >= totalWaterDays){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}