import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = str.length();
		
		String makeUCPC = "UCPC";
		int j = 0;
		for(int i = 0; i < n; i++) {
			
			if(str.charAt(i) == makeUCPC.charAt(j)) {
				j++;
			}
			if(j == 4) {
				System.out.println("I love UCPC");
				return;
			}	
		}
		
		System.out.println("I hate UCPC");
		
			
	}
}
