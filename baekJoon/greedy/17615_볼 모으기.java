import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int rTmpCount = 0;
        int rCount = 0;

        int bTmpCount = 0;
        int bCount = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'R'){
                rTmpCount++;

                bCount += bTmpCount;
                bTmpCount = 0;
            }
            else{
                bTmpCount++;

                rCount += rTmpCount;
                rTmpCount = 0;
            }
        }

        int answer1 = Math.min(rCount, bCount);


        rTmpCount = 0;
        rCount = 0;

        bTmpCount = 0;
        bCount = 0;
        for(int i = n-1; i >= 0; i--){
            if(s.charAt(i) == 'R'){
                rTmpCount++;

                bCount += bTmpCount;
                bTmpCount = 0;
            }
            else{
                bTmpCount++;

                rCount += rTmpCount;
                rTmpCount = 0;
            }
        }

        int answer2 = Math.min(rCount, bCount);
        int answer = Math.min(answer1, answer2);
        System.out.println(answer);
    }
}
