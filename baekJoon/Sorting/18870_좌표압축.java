package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] rankArr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){

            arr[i] = rankArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rankArr);

        int rank = 0;
        for(int i : rankArr){

            if(!map.containsKey(i)){
                map.put(i, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : arr){
            int compression = map.get(key);
            sb.append(compression + " ");
        }

        System.out.println(sb);

    }
}
