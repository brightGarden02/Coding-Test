import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < T; i++) {

            int n = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String s2 = br.readLine();
            int diffWCount = 0;
            int diffBCount = 0;
            for(int j = 0; j < n; j++){
                if(s1.charAt(j) != s2.charAt(j)){

                    if(s1.charAt(j) == 'W'){
                        diffWCount++;
                    }
                    else{
                        diffBCount++;
                    }

                }
            }
            ans = Math.max(diffWCount, diffBCount);
            System.out.println(ans);

        }

    }
}
