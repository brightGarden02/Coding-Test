import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int M = sc.nextInt();
       
	int tired = 0;
	int worked = 0;
		
	if(A > M) {
		System.out.println("0");
		return;
	}
		
	for(int i = 0; i < 24; i++) {
			
		if(tired + A <= M) {
			tired += A;
			worked += B;
		}
		else {
			tired -= C;
		}
            
            if(tired < 0){
                tired = 0;
            }
            
	}
		
		
        System.out.println(worked);
	}

}
