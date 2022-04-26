import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        int ans = 0;

        ans = solve(arr);
        System.out.println(ans);
    }

    public static int solve(int[] arr){

        int n = arr.length;

        if(n == 1){
            return arr[0];
        }

        if(n % 2 == 0){
            return arr[n/2 -1];
        }
        else{
            return arr[n/2];
        }
    }
}
