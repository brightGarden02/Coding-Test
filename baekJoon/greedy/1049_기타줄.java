import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] brandArr = new int[M];
		int[][] costArr = new int[M][2];
		
		for(int i = 0; i < M; i++) {
			StringTokenizer cost = new StringTokenizer(br.readLine());
			costArr[i][0] = Integer.parseInt(cost.nextToken());
			costArr[i][1] = Integer.parseInt(cost.nextToken());
			
		}
		
		int minPackageCost = Integer.MAX_VALUE;
		int minOneCost = Integer.MAX_VALUE;
		for(int i = 0; i < M; i++) {
			
			minPackageCost =  Math.min(minPackageCost, costArr[i][0]);
			minOneCost =  Math.min(minOneCost, costArr[i][1]);
			
		}
		
		int ans = 0;
		ans = Math.min(((N/6)+1) * minPackageCost, N * minOneCost);
		ans = Math.min(ans, (N/6) * minPackageCost + (N%6) * minOneCost);
		
		
		System.out.println("ans: " + ans);
	}
}
