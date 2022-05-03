import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(solve(n, m));

    }

    public static int solve(int n, int m) {
        if(n == 1 || m == 1){
            return 1;
        }
        if(n == 2){
            return Math.min(4, (m+1)/2);
        }
        if(m < 7){
            return Math.min(4, m);
        }
        else{
            return m-2;
        }
    }

}
