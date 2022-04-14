package coding_test0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
        int sum = Integer.MAX_VALUE;
        
        while(subtraction.hasMoreTokens()) {
        	int temp = 0;
        	
        	StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");
        	
        	while(addition.hasMoreTokens()) {
        		temp += Integer.parseInt(addition.nextToken());
        	}
        	
        	
        	if(sum == Integer.MAX_VALUE) {

        		sum = temp;
        	}
        	else {

        		sum -= temp;
        	}
        }
        
        System.out.println(sum);
	}
}