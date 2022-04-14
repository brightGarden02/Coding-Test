package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int count = 1;
			int N = Integer.parseInt(br.readLine());
			
			
			int[][] arr = new int[N][2];
			
			for(int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
			    arr[j][0] = Integer.parseInt(st.nextToken());
			    arr[j][1] = Integer.parseInt(st.nextToken());
			}
			
			
			Arrays.sort(arr, new Comparator<int[]>() {
					
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[0], o2[0]);
				}
				
			});
			
			
			int min = arr[0][1];
			for(int j = 1; j < N; j++) {
				
				if(arr[j][1] < min) {
					min = arr[j][1];
					count++;
				}
			}
			
			System.out.println(count);
		
		}
		
		
	}
}