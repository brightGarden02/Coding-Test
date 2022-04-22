import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] antenaArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			antenaArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(antenaArr);
		
		int mid = antenaArr[(n-1)/2];
		System.out.println(mid);
		
	}
}
