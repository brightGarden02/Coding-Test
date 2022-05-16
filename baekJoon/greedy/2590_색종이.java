import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[7];

        for(int i = 1; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        answer += arr[6];

        while (arr[1] != 0 || arr[2] != 0 || arr[3] != 0 || arr[4] != 0 || arr[5] != 0) {

            while (arr[5] > 0) {

                int place = 36;
                arr[5]--;
                place -= 25;
                if (arr[1] <= place){
                    arr[1] = 0;
                }
                else{
                    arr[1] -= place;
                }
                answer++;
            }

            while (arr[4] > 0) {

                int place = 36;
                arr[4]--;
                place -= 16;

                if (arr[2] > 5) {
                    arr[2] -= 5;
                    place -= 4 * 5;
                }
                else {
                    place -= 4 * arr[2];
                    arr[2] = 0;
                }

                if (arr[1] <= place) {
                    arr[1] = 0;
                }else{
                    arr[1] -= place;
                }

                answer++;
            }

            while (arr[3] > 0) {

                int place = 36;
                if (arr[3] > 4)
                {
                    arr[3] -= 4;
                    place = 0;
                }
                else
                {
                    place -= 9 * arr[3];
                    arr[3] = 0;
                }
                if (place == 27 && arr[2] > 5)
                {
                    arr[2] -= 5;
                    place -= 20;
                }
                else if (place == 27 && arr[2] <= 5)
                {
                    place -= 4 * arr[2];
                    arr[2] = 0;
                }
                if (place == 18 && arr[2] > 3)
                {
                    arr[2] -= 3;
                    place -= 12;
                }
                else if (place == 18 && arr[2] <= 3)
                {
                    place -= 4 * arr[2];
                    arr[2] = 0;
                }
                if (place == 9 && arr[2] >= 1)
                {
                    place -= 4 * arr[2];
                    arr[2] = 0;
                }

                if (arr[1] <= place)
                    arr[1] = 0;
                else
                    arr[1] -= place;

                answer++;
            }
            while (arr[2] > 0)
            {
                int place = 36;

                if(arr[2] > 9){
                    arr[2] -= 9;
                    place = 0;
                }
                else {
                    place -= 4 * arr[2];
                    arr[2] = 0;
                }

                if(arr[1] <= place){
                    arr[1] = 0;
                }
                else{
                    arr[1] -= place;
                }

                answer++;
            }
            while (arr[1] > 0)
            {
                if (arr[1] > 36)
                    arr[1] -= 36;
                else
                    arr[1] = 0;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
