package coding_test0405;

import java.util.Scanner;
import java.util.ArrayList;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		}
		
		
        System.out.println(worked);
	}

}
