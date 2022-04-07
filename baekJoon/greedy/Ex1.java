package coding_test0405;

import java.util.Scanner;
import java.util.ArrayList;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int bong = 0;
		while(true) {
			
			if(N % 5 == 0) {
				bong += N / 5;
				System.out.println(bong);
				break;
			}
			
			else {
				N -= 3;
				bong++;
			}
			
			if(N < 0){
				System.out.println("-1");
				break;
			}
		}
		
		
		
	}

}
