package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = "";
        while((str = br.readLine()) != null){

            if(str.isEmpty()) break;
            st = new StringTokenizer(str);

            String s = st.nextToken();
            String t = st.nextToken();

            int i = 0;
            int j = 0;
            int count = 0;
            while(i < s.length() && j < t.length()){

                if(s.charAt(i) == t.charAt(j)){
                    i++;
                    j++;
                    count++;
                }
                else{
                    j++;
                }

            }

            if(s.length() == count){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }

    }
}