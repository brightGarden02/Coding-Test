package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        while(n-- > 0){
            Map<String, Integer> map = new HashMap<>();
            int m = Integer.parseInt(br.readLine());

            while(m-- > 0){

                String[] arr = br.readLine().split(" ");
                String value = arr[0];
                String key = arr[1];

                map.put(key, map.getOrDefault(key, 0 ) + 1);

            }

            int answer = 1;
            for(int val : map.values()){
                answer *= (val + 1);
            }
            System.out.println(answer-1);
        }



    }
}
