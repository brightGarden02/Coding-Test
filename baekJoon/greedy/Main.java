package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st1.nextToken());
		int L = Integer.parseInt(st1.nextToken());
		
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] heightArr = new int[N];
		
		for(int i = 0; i < N; i++) {
			
			heightArr[i] = Integer.parseInt(st2.nextToken());
			
		}
		Arrays.sort(heightArr);
		
		
		for(int i = 0; i < N; i++) {
			
			if(heightArr[i] <= L) {
				L++;
			}
		}
		
		System.out.println(L);
		
	}
}