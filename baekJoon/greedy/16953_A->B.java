import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
       
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		String sB = "";
		int ans = 1;
		
		while(A != B) {
			
			if(B % 2 == 0) {
				
				B = B / 2;
			}
			else {
				
				if(B % 10 == 1) {
					B = B / 10;
				}
				else {
					System.out.println(-1);
					return;
				}
			}
			
			ans++;
			if(A > B) {
				System.out.println(-1);
				return;
			}
			
			System.out.println("A : " + A + ", B: " + B);
		}
		
		System.out.println(ans);
	}
}
