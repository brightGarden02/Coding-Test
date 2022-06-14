package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        String sumString = "";
        for(int i = 0; i < s1.length(); i++){
            sumString += s1.charAt(i);
            sumString += s2.charAt(i);
        }

        while(sumString.length() > 2){

            String tmpSumString = "";
            for(int i = 0; i < sumString.length()-1; i++){

                int num1 = sumString.charAt(i) - '0';
                int num2 = sumString.charAt(i + 1) - '0';
                int tmp = (num1 + num2) % 10;
                tmpSumString += Integer.toString(tmp);
            }

            sumString = tmpSumString;
        }

        System.out.println(sumString);

    }
}
