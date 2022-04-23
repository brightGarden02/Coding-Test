package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		String L = st.nextToken();
		String R = st.nextToken();
		
		int eightMinSize = 0;
		int eightMaxSize = L.length();
		
		System.out.println("L: " + L + ", R: " + R + ", eightMaxSize: " + eightMaxSize);
		
		int L_num =  Integer.parseInt(L);
		int R_num =  Integer.parseInt(R);
		int ans = Integer.MAX_VALUE;
		for(int i = L_num; i <= R_num; i++) {
			
			String tmp = Integer.toString(i);
			int eightNums = 0;
			
			for(int j = 0; j < tmp.length(); j++) {
				if(tmp.charAt(j) == '8') {
					
					eightNums++;
				}
			}
			if(eightNums == 0) {
				System.out.println("eightNums: " +  eightNums);
				return;
			}
			ans = Math.min(ans, eightNums);
			
		}
		System.out.println("eightNums ans: " +  ans);
		
		
	}
}