package ex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Map<Character, Integer> map = new HashMap<>();

        char c = 'a';
        for(int i = 1; i <= 26; i++){
            map.put(c, i);
            c += 1;
        }

       // System.out.println(map);
        long answer = 0;
        int prime = 1234567891;
        long mul = 1;
        for(int i = 0; i < str.length(); i++){

            char tmp = str.charAt(i);
            answer += map.get(tmp) * mul % prime;
            mul = (mul * 31) % prime;
        }

        System.out.println(answer % prime);

    }
}