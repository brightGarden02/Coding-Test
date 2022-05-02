package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int couldUse = 0;
        int campingPeroid = 0;
        int vacation = 0;
        int i = 1;
        while(true){

            String s = br.readLine();
            String[] arr = s.split(" ");

            couldUse = Integer.parseInt(arr[0]);
            if(couldUse == 0) return;

            campingPeroid = Integer.parseInt(arr[1]);
            vacation = Integer.parseInt(arr[2]);


            int div = vacation / campingPeroid;
            int rem = vacation % campingPeroid;
            int ans = (div * couldUse) + Math.min(rem, couldUse);

            System.out.println("Case " + i + ": " + ans);
            i++;
        }

    }
}