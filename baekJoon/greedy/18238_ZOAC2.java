import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        

    	char start = 'A';
        int ans = 0;
        for(int i = 0; i < str.length(); i++) {
        	char end = str.charAt(i);
        	
        	int a = end - start;
        	int b = start - end;
        	if(a < 0) {
        		a += 26;
        	}
        	if(b < 0) {
        		b += 26;
        	}
        	
        	ans += Math.min(a, b);
        	
        	start = end;
        }
        
        System.out.println(ans);
	}

}

