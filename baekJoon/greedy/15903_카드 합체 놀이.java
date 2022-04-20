import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		
		long[] card = new long[n];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i = 0; i < m; i++) {
			Arrays.sort(card);
			
			long add = card[0] + card[1];
			card[0] = add;
			card[1] = add;
		}
		
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans += card[i];
		}
		
		
		System.out.println(ans);
	}
}
