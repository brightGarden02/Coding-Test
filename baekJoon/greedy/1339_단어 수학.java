import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] alpha = new int[26];

        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }

        for(int i = 0; i < n; i++){
            int m = arr[i].length();
            int temp = (int)Math.pow(10, m-1);

            for(int j = 0; j < m; j++){
                char c = arr[i].charAt(j);
                alpha[c - 65] += temp;
                temp /= 10;
            }

        }

        Arrays.sort(alpha);

        int numbering = 9;
        for(int i = alpha.length-1; i >= 0; i--){
            if(alpha[i] == 0){
                break;
            }
            answer += alpha[i] * numbering;
            numbering--;
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
