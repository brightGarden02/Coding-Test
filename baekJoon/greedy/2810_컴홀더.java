import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        		
        int sCount = 0;
        int lCount = 0;
        String seat = br.readLine();
        
        
        for(int i = 0; i < n; i++){
            if(seat.charAt(i) == 'S'){
                sCount++;
            }
            else{
                lCount++;
            }
        }
        int ans = sCount + lCount/2 + 1;
        ans = Math.min(ans, n);
        System.out.println(ans);
                
	}
}
