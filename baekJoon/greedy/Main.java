package coding_test0405;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = str.length();
	
		if(str.equals("X")) {
			System.out.println(-1);
			return;
		}
		int X = 0;
		String ans = "";
		String A4 = "AAAA";
		String B2 = "BB";
		
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == 'X') {
				X++;
				
			}
			else {
				if(X % 2 == 1) {
					System.out.println(-1);
					return;
				}
			}
		}
		if(X % 2 == 1) {
			System.out.println(-1);
			return;
		}
		
		
		for(int i = 0; i < n; i++) {
			
			if(str.charAt(i) == '.') {
				
				ans += ".";
				continue;
			}
			else {
				
				if(i+3 < n && str.substring(i, i+4).equals("XXXX")) {
					ans += A4;
					i += 3;
					continue;
				}
				if(i+1 < n && str.substring(i, i+2).equals("XX")) {
					ans += B2;
					i += 1;
					continue;
				}
				
			}
			
		}
		System.out.println(ans);
			
	}
}