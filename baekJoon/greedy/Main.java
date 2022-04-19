package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		
		while(testCase > 0) {
			
			int n = Integer.parseInt(br.readLine());
			int[] arr1 = new int[n];
			int[] arr2 = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int minLevel = Integer.MAX_VALUE;
			
			for(int i = 0; i < n; i++) {
				arr1[i] = Integer.parseInt(st.nextToken());  
			}
			Arrays.sort(arr1);
			int left = 0;
			int right = n-1;
			
			for(int i = 0; i < n; i++) {
				
				if(i % 2 == 0) {
					arr2[left] = arr1[i];
					left++;
				}
				else {
					arr2[right] = arr1[i];
					right--;
				}
				
				
			}	
			
			int diff = 0;
			int maxDiff = Integer.MIN_VALUE;
			for(int j = 0; j < n-1; j++) {
				diff = Math.abs(arr2[j] - arr2[j+1]);
				maxDiff = Math.max(maxDiff, diff);
					
			}
			maxDiff = Math.max(maxDiff, Math.abs(arr2[0] - arr2[n-1]));
			
			
			System.out.println("ans: " + maxDiff);
			testCase--;
		}
		
		
	}
}