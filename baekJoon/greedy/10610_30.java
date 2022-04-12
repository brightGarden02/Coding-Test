import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String s = br.readLine();
        int n = s.length();
        
        int[] arr = new int[10];
        int sum = 0;
        String tmpS = "";
        for(int i = 0; i < n; i++) {
        	
        	tmpS = s.substring(i, i+1);
        	int digit = Integer.parseInt(tmpS);
        	
        	arr[digit]++;
        	sum += digit;
        }
        
        if(!s.contains("0") || sum % 3 != 0) {
        	System.out.println("-1");
        	return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
        	
        	while(arr[i] > 0) {
        		sb.append(i);
        		arr[i]--;
        	}
        	
        }
        System.out.println(sb.toString());
        
	}
}
