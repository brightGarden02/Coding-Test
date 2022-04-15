package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String s = br.readLine();
		int ans = 0;
		
		int i = 0;
		while(str.length() > 0) {
			
			if(str.startsWith(s)) {
				ans++;
				str = str.substring(s.length());
			}
			else {
				str = str.substring(1);
			}
		}
		System.out.println(ans);
		
	}
}