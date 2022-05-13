package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o2[0] - o1[0];
                }
                else{
                    return o2[1] - o1[1];
                }
            }
        });

        int maxPlay = arr[0][1] - arr[0][0];
        for(int i = 1; i < n; i++){
            if(arr[i][1] < maxPlay){
                maxPlay = arr[i][1] - arr[i][0];
            }
            else{
                maxPlay = maxPlay - arr[i][0];
            }
        }

        System.out.println(maxPlay);

    }
}