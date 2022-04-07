import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int val = 0;
		int maxVal = 0;
		for(int i = 0; i < n; i++) {
			val = 0;
			for(int j = i+1; j < n; j++) {
				if(arr[i] > arr[j])
					val++;
				else
					break;
			}
			maxVal = Math.max(maxVal, val);
		}
		
		System.out.println(maxVal);
	}
}
