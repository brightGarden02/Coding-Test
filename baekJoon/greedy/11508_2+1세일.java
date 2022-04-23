import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		Integer[] costArr= new Integer[n];
		
		for(int i = 0; i < n; i++) {
			costArr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(costArr, Comparator.reverseOrder());
		for(int i = 0; i < n; i++) {
			
			if(i % 3 == 2) {
				continue;
			}
			else {
				ans += costArr[i];
			}
		}
		
		
		System.out.println(ans);
		
	}
}
