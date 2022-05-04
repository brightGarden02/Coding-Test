import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] timeArr = new int[n][2];
        for(int i = 0; i < n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            timeArr[i][0] = Integer.parseInt(st.nextToken());
            timeArr[i][1] = Integer.parseInt(st.nextToken());

        }

        timeSortFunction(timeArr);

        int start = timeArr[0][1] - timeArr[0][0]; 
        for(int i = 1; i < n; i++){

            if(start < timeArr[i][1]){
               start =  start - timeArr[i][0];
            }
            else{
                start = timeArr[i][1] - timeArr[i][0];
            }
        }

        if(start > 0){
            System.out.println(start);
        }
        else{
            System.out.println(-1);
        }


    }

    private static void timeSortFunction(int[][] timeArr) {

        Arrays.sort(timeArr, new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1] == o2[1]){
                    return o2[0] - o1[0];
                }
                else{
                    return o2[1] - o1[1];
                }

            }
        });
    }
}
