package ex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {

            if(binarySearch(Integer.parseInt(st.nextToken())) >= 0){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }

    private static int binarySearch(int number) {

        int l = 0;
        int r = arr.length-1;

        while(l <= r){

            int mid = (l + r) / 2;

            if(number < arr[mid]){
                r = mid - 1;
            }
            else if(number > arr[mid]){
                l = mid + 1;
            }
            else{
                return mid;
            }

        }

        return -1;
    }
}
