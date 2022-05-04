package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = str.length();
        char[] arr = new char[n+1];
        arr[0] = '0';

        for(int i = 1; i <= n; i++){
            arr[i] = str.charAt(i-1);
        }
        int ans = 0;

        for(int i = 1; i <=n; i++){

            if(arr[i] == 'N') continue;
            for(int k = i; k <= n; k += i){
                if(arr[k] == 'Y'){
                    arr[k] = 'N';
                }
                else{
                    arr[k] = 'Y';
                }
            }
            ans++;
        }

        System.out.println(ans);
    }
}