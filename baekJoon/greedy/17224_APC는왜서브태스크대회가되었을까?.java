import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int L = sc.nextInt();
	int K = sc.nextInt();
		
				
        int scores = 0;
        
        int[][] p = new int[N][2];
        for(int i = 0; i < N; i++) {
        	
        	p[i][0] = sc.nextInt();
        	p[i][1] = sc.nextInt();
        	
        }
        
        for(int i = 0; i < N && K > 0; i++) {
        	
        	if(p[i][1] <= L) {
        		scores += 140;
        		K--;
        	}
        }
        
        for(int i = 0; i < N && K > 0; i++) {
        	
        	if(p[i][0] <= L && L < p[i][1]) {
        		scores += 100;
        		K--;
        	}
        }
        
        System.out.println(scores);
	}

}
