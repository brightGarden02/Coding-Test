import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        long num = Long.parseLong(br.readLine());
        long sum = 0;
        int count = 0;
        
        int i = 1;
        while(true){
            
            if(sum > num){
                break;    
            }
            
            sum += i;
            i++;
            count++;
        }
        
	System.out.println(count-1);
		
	}
}
