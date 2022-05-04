import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer students = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = Integer.parseInt(students.nextToken());
        }
        int[] diffArr = new int[n-1];
        for(int j = 0; j < n-1; j++){
            diffArr[j] = arr1[j+1] - arr1[j];
        }

        Arrays.sort(diffArr);
        int ans = 0;
        for(int j = 0; j < n-k; j++){
            ans += diffArr[j];
        }


        System.out.println(ans);
    }
}
