package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        Map<Integer, Double> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int key = Integer.parseInt(st.nextToken());
                double value = Double.parseDouble(st.nextToken());

                if(map.containsKey(key)){

                    if(map.get(key) > value){
                        continue;
                    }
                    else{
                        map.put(key, value);
                    }
                }
                else{
                    map.put(key, value);
                }
            }
        }


        List<Integer> listKeySet = new ArrayList<>(map.keySet());

        Collections.sort(listKeySet, (value1, value2) ->
                (map.get(value2).compareTo(map.get(value1))));

        double answer = 0;

        for (int key : listKeySet) {

            answer += map.get(key);
            k--;

            if(k == 0) break;
        }

        System.out.println(String.format("%.1f", answer));
    }
}

