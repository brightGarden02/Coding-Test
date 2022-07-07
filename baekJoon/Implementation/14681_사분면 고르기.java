package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println(findQuadrant(x, y));

    }

    private static int findQuadrant(int x, int y) {

        if(x > 0 && y > 0){
            return 1;
        }
        else if(x < 0 && y > 0){
            return 2;
        }
        else if(x < 0 && y < 0){
            return 3;
        }
        else {
            return 4;
        }

    }
}
