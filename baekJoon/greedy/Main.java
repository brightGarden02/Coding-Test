package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		
		int[] leaked = new int[N];
		StringTokenizer leak = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			leaked[i] = Integer.parseInt(leak.nextToken());
		}
		
		Arrays.sort(leaked);
		double leakLen = leaked[0] - 0.5 + L;
		int ans = 1;
		
		
		for(int i = 1; i < N; i++) {
			
			if(leakLen < leaked[i] + 0.5) {
				leakLen = leaked[i] - 0.5 + L;
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}