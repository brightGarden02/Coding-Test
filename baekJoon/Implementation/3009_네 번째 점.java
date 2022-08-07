package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = 3;
        int[] xArr = new int[n];
        int[] yArr = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }

        deleteSameValue(xArr);
        deleteSameValue(yArr);

        System.out.println(findCoordinatePoint(xArr) + " " + findCoordinatePoint(yArr));
   }

    private static int findCoordinatePoint(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0) {
                return arr[i];
            }
        }

        return -1;
    }

    private static void deleteSameValue(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    arr[i] = 0;
                    arr[j] = 0;
                    return;
                }
            }
        }

    }
}
