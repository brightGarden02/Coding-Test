package codingMain;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int b_counts = 0;
        int r_counts = 0;
        int i = 0;
        while (i < n){

            if(s.charAt(i) == 'B'){
                b_counts++;
                while(i < n && s.charAt(i) == 'B'){
                    i++;
                }
            }
            else{
                r_counts++;
                while(i < n && s.charAt(i) == 'R'){
                    i++;
                }
            }

        }
        int answer = 1;
        answer += Math.min(b_counts, r_counts);

        System.out.println(answer);
    }
}