import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int ans = 0;
        for(int i = 0; i < n; i++) {
        	if(str.charAt(i) == 'p' && i+3 < n) {
        		
        		if(str.substring(i, i+4).equals("pPAp")) {
        			ans++;
        			i += 3;
        		}
        		
        	}
        }
        System.out.println(ans);
	}

}
