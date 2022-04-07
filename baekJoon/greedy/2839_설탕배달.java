import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		int Nkg = sc.nextInt();
		
		int answer = 0;
		while(true) {
			
			if(Nkg % 5 == 0) {
				answer += Nkg / 5;
				System.out.println(answer);
				break;
			}
			else {
				Nkg -= 3;
				answer++;
			}
			
			if(Nkg < 0){
				System.out.println("-1");
				break;
			}
		}
		
	}
}
