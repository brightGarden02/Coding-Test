package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        printStar(n);

    }

    private static void printStar(int n) {

        while(n > 0){

            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();

            n--;
        }
    }
}
