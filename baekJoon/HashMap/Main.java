package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();


        for(int i = 0; i < n; i++){

            String[] arr = br.readLine().split(" ");
            map.put(arr[0], arr[1]);
        }

        for(int i = 0; i < m; i++){
            System.out.println(map.get(br.readLine()));
        }


    }
}