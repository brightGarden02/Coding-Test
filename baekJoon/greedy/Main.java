package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		String str = br.readLine();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			char c = str.charAt(i);
			
			if(c == 'H') {
				arr[i] = 1;
			}
			else {
				arr[i] = 2;
			}
		}
		
		int ans = 0;
		
		for(int i = 0; i < N; i++) {
			
			if(arr[i] == 2) {
				
				int rangeLeft = Math.max(0, i-K);
				int rangeRight = Math.min(i + K, N-1) ;
				
				for(int j = rangeLeft; j <= rangeRight; j++) {
						
					if(arr[j] == 1) {
						arr[j] = 0;
						ans++;
						break;
					}
				}
			}
			
		}
		
		System.out.println(ans);
	}
}