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
        	int[][] meetingArr = new int[n][2];
        
		
		for(int i = 0; i < meetingArr.length; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			meetingArr[i][0] = start;
			meetingArr[i][1] = end;
			
		}
		
		Arrays.sort(meetingArr, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				else {
					return o1[1] - o2[1];
				}
			}
		});
		
		
		int end = 0;
		int count = 0;
		
		for(int i = 0; i < meetingArr.length; i++) {
			
			int nextStart = meetingArr[i][0];
			int nextEnd = meetingArr[i][1];
			
			if(end <= nextStart) {
					
				end = nextEnd;
				count++;
			}
			
		}
		System.out.println(count);
		
	}
}
