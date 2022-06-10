package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        while(str.length() > 10){
            String tmp = str.substring(0, 10);
            System.out.println(tmp);
            str = str.substring(10);
        }

        if(str.length() > 0){
            System.out.println(str);
        }

    }
}
