import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int ans = 0;
        for(int i = n-1; i >= 1; i--){
            int tmp = 0;
            if(arr[i-1] >= arr[i]){
                tmp = arr[i] - 1;
                if(tmp <= 0){
                    continue;
                }

                ans += arr[i-1] - tmp;
                arr[i-1] = tmp;
            }

        }

        System.out.println(ans);
    }
}
