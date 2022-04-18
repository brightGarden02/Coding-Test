package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int n = str.length();
		
		int[] arr = new int[26];
		for(int i = 0; i < n; i++) {
			
			arr[str.charAt(i) - 'A']++;
			
		}
			
		
		int oddCnt = 0;
		int center = 0;
		for(int i = 0; i < 26; i++) {
			
			if(arr[i] % 2 != 0) {
				center = i;
				oddCnt++;
			}
		}
			
		
		if(oddCnt > 1 || (oddCnt == 1 && n % 2 == 0)) {
			System.out.print("I'm Sorry Hansoo");
			return;
		}
		
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < arr[i]/2; j++) {
				
				result.append((char)(i + 'A'));
			}
		}
			
		
		
		StringBuffer resultReverse = new StringBuffer(result.toString());
		if(oddCnt == 1) {
			result.append((char)(center + 'A'));
		}
		
		System.out.println(result.toString() + resultReverse.reverse());
		
	}
}