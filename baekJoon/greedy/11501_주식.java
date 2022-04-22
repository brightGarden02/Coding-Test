import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] priceArr = new int[N];
			for(int j = 0; j < N; j++) {
				priceArr[j] = Integer.parseInt(st.nextToken());
			}
			
			long ans = 0;
			int maxPrice = 0;
			for(int j = N-1; j >= 0; j--) {
				
				if(priceArr[j] > maxPrice) {
					maxPrice = priceArr[j];
				}
				else {
					ans += (maxPrice - priceArr[j]);
				}
			
			}
			System.out.println(ans);
			
		}
	
		
	}
}
