package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){

            String[] arr = br.readLine().split(" ");
            for (String s : arr){

                String tmp = "";
                for(int i = 0; i < s.length(); i++){
                    tmp = s.charAt(i) + tmp;
                }
                System.out.print(tmp + " ");
            }
            System.out.println();

        }

    }
}
