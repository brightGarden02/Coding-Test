package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int answer = 0;
        while(T-- > 0){

            String str = br.readLine();
            boolean flag = true;
            for(int i = 0; i < str.length()-2 && flag; i++){
                char c1 = str.charAt(i);

                for(int j = i+1; j < str.length()-1 && flag; j++){
                    char c2 = str.charAt(j);

                    if(c1 != c2){
                        for(int k = j+1; k < str.length() && flag; k++){
                            char c3 = str.charAt(k);
                            if(c1 == c3){
                                flag = false;

                            }
                        }
                    }

                }
            }

            if(flag){
                answer++;
            }
        }

        System.out.println(answer);

    }
}