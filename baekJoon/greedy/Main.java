package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
        int coinNumbs = 0;
        int[] coinsArr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	coinsArr[i] = Integer.parseInt(br.readLine());
        }
        
        int j = 1;
        
        while(k > 0) {
        	
        	if(k >= coinsArr[n-j]) {
        		
        		coinNumbs += k / coinsArr[n-j];
        		k = k % coinsArr[n-j];
        	}
        	j++;
        
        }
		
        System.out.println(coinNumbs);
	}
}