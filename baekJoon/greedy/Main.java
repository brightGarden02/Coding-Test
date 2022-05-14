package codingMain;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = "";
        for(int i = 0; i < n; i++){
            s += br.readLine();
        }

        int l = 0;
        int r = s.length()-1;
        StringBuffer sb = new StringBuffer();

        while(l <= r){

            char l_char = s.charAt(l);
            char r_char = s.charAt(r);

            if(l_char < r_char){
                sb.append(l_char);
                l++;
            }
            else if(l_char > r_char) {
                sb.append(r_char);
                r--;
            }
            else{

                int l2 = l, r2 = r;
                boolean flag = false;
                while(l2 <= r2){

                    char l_char2 = s.charAt(l2);
                    char r_char2 = s.charAt(r2);

                    if(l_char2 < r_char2){
                        flag = true;
                        sb.append(l_char);
                        l++;
                        break;
                    }
                    else if(l_char2 > r_char2) {
                        flag = true;
                        sb.append(r_char);
                        r--;
                        break;
                    }
                    else{
                        l2++;
                        r2--;
                    }
                }

                if(!flag){
                    sb.append(l_char);
                    l++;
                }
            }
        }

        for(int i = 0; i < sb.length(); i++){

            System.out.print(sb.charAt(i));
            if(i != 0 && (i+1) % 80 == 0){
                System.out.println();
            }
        }

    }
}