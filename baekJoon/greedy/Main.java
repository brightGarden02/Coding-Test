package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ballNums = Integer.parseInt(st.nextToken());
		int buckets = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i = 1; i <= buckets; i++) {
			sum += i;
		}
		ballNums -= sum;
		
		if(ballNums < 0) {
			System.out.println(-1);
			return;
		}
		
		if(ballNums % buckets == 0) {
			System.out.println(buckets-1);
			return;
		}
		else {
			System.out.println(buckets);	
			return;
		}
		
		
	}
}