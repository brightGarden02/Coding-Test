import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();
        boolean flag = true;

        if(x < n){
            flag = false;
        }
        if(x / 26 > n){
            flag = false;
        }
        if(x / 26 == n && x % 26 != 0){
            flag = false;
        }

        //각자리에 A배치하기 위함
        x -= n;
        if(flag){

            while(x >= 25){
                sb.append('Z');
                x -= 25;
            }

            if(x > 0){
                char tmp = (char) ('A' + x);
                sb.append(tmp);
            }
        }
        else{
            System.out.println("!");
            return;
        }

        int len = sb.length();
        for(; len < n; len++){
            sb.append('A');
        }

        sb.reverse();

        System.out.println(sb);

    }
}
