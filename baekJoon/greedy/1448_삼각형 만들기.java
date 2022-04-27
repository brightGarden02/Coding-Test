import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n];
        int ans = -1;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < n-2; i++){
            if(arr[i] < arr[i+1] + arr[i+2]){
                ans = Math.max(ans,
                        arr[i] + arr[i+1] + arr[i+2]);
            }

        }

        System.out.println(ans);
    }
}
