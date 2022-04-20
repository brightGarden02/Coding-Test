import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long minAnger = 0;
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
			
		int j = 1;
		for(int i = 0; i < n; i++) {
			
			minAnger += Math.abs(j - arr[i]);
			j++;
			
		}
		
		System.out.println(minAnger);
		
	}
}
