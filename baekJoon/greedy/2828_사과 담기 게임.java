import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		int screenSize = Integer.parseInt(st.nextToken());
		int bucketSize = Integer.parseInt(st.nextToken());
		int bleft = 1;
		int bright = bucketSize;
		
		
		int apples = Integer.parseInt(br.readLine());
		int[] applePosArr = new int[apples+1];
		
		for(int i = 1; i <= apples; i++) {
			applePosArr[i] = Integer.parseInt(br.readLine());
		}
		
		int ans = 0;
		for(int i = 1; i <= apples; i++) {
			
			if(bleft <= applePosArr[i] && applePosArr[i] <= bright) {
				System.out.println("right position");
				continue;
			}
			else {
				
				if(bright < applePosArr[i]) {
					ans += applePosArr[i] - bright;
					bright = applePosArr[i];
					bleft = bright - bucketSize + 1;
						
				}
				else if(applePosArr[i] < bleft) {
					
					ans += bleft - applePosArr[i];
					bleft = applePosArr[i];
					bright = bleft + bucketSize - 1; 
				}
			}
		}
		System.out.println(ans);
		
	}
}
