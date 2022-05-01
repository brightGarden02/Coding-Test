import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        long ans = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer stData = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){

                arr[i][j]= Integer.parseInt(stData.nextToken());
                ans += arr[i][j];
            }
        }

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int maxVal = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){

                maxVal = Math.max(maxVal, arr[i][j]);
            }
            set.add(maxVal);
        }

        for(int i = 0; i < m; i++){
            int maxVal = Integer.MIN_VALUE;
            for(int j = 0; j < n; j++){

                maxVal = Math.max(maxVal, arr[j][i]);
            }
            set.add(maxVal);
        }

        Iterator<Integer> iter= set.iterator();
        while(iter.hasNext()){
            ans -= iter.next();
        }


        System.out.println(ans);
    }
}
