import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Stack<Character> st = new Stack<>();
      	
        String s = br.readLine();
        int n = s.length();
        
        for(int i = 0; i < n; i++) {
        	
        	char c = s.charAt(i);
            	if(st.isEmpty()) {
            		st.push(c);
            	}
            	else {
            		if(st.peek() == c) {
            			continue;
            		}
            		else {
            			st.push(c);
            		}
            	}
        
        }
        
        
        int oneNums = 0;
        int zeroNums = 0;
        while(!st.isEmpty()) {
        	
        	char c = st.pop();
        	if(c == '1') {
        		oneNums++;
        	}
        	else {
        		zeroNums++;
        	}
        }
        int answer = Math.min(oneNums, zeroNums);
        
        System.out.println(answer);
        
	}
}
