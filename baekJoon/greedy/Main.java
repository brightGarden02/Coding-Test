package coding_test0405;
import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
		
		long[] sArr = new long[n-1];
        for(int i = 0; i < n-1; i++) {
        	
        	sArr[i] = Long.parseLong(st.nextToken()); 
        }
        
        long[] literArr = new long[n];
        st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			
			literArr[i] = Long.parseLong(st.nextToken());
		}
        
		
        
		long Ssum = 0;
		for(int i = 0; i < n-1; i++) {
			Ssum += sArr[i];
		}
		
		long answer = 0;
		long literMin = literArr[0];
		for(int i = 0; i < n - 1; i++) {
			
			if(literArr[i] < literMin) {
				literMin = literArr[i];
			}
			
			answer += (literMin * sArr[i]);
		}
		
        System.out.println(answer);
	}
}