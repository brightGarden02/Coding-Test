import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int[] countArr = new int[5];
            Arrays.fill(countArr, 0);

            int val = Integer.parseInt(br.readLine());
            countArr = function(val, countArr);

            for(int j = 0; j < 5; j++){
                System.out.print(countArr[j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * ADDH: $t' = t + 60$ 
     * ADDT: $t' = t + 10$ 
     * MINT: $t' = t - 10$ 
     * ADDO: $t' = t + 1$ 
     * MINO: $t' = t - 1$ 
     */
    private static int[] function(int val, int[] countArr) {

        if(val >= 60){
           countArr[0] += val / 60;
           val = val % 60;
        }
        if(val <= 35){
            if(5 < val % 10){
                countArr[1] += val/10 + 1;
                countArr[4] += 10 - val % 10;
            }
            else {
                countArr[1] += val / 10;
                countArr[3] += val % 10;
            }
        }
        else{

            countArr[0]++;

            if(val % 10 >= 5){
                countArr[2] += 6 - (val / 10 + 1);
                countArr[4] += 10 - val % 10;
            }
            else {
                countArr[2] += 6 - val / 10;
                countArr[3] += val % 10;
            }
        }

        return countArr;
    }
}
