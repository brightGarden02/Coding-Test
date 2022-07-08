package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        map.put("ABC", 3);
        map.put("DEF", 4);
        map.put("GHI", 5);
        map.put("JKL", 6);
        map.put("MNO", 7);
        map.put("PQRS", 8);
        map.put("TUV", 9);
        map.put("WXYZ", 10);

        String str = br.readLine();

        int answer = 0;
        for(int i = 0; i < str.length(); i++){
            String s = str.substring(i, i+1);

            for(String key : map.keySet()){
                if(key.contains(s)){
                    answer += map.get(key);
                }
            }
        }

        System.out.println(answer);

    }
}