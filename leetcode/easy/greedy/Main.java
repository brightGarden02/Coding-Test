package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] tipArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			tipArr[i] = Integer.parseInt(br.readLine());
		}
	
		Arrays.sort(tipArr);
		int j = 0;
		long ans = 0;
		for(int i = n-1; i >= 0; i--) {
			
			int tip = tipArr[i] - j;
			j++;
			
			if(tip > 0) {
				ans += tip;
			}
		}
		System.out.println(ans);
		
		
	}
}