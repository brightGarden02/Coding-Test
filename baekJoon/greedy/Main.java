package coding_test0405;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long[] arr = new long[n];
		
		for(int i = 0; i < n; i++){
			
			arr[i] = sc.nextInt();
	
		}
		
		for(int i = 0; i < m; i++){
			
			Arrays.sort(arr);
			long add = arr[0] + arr[1];
			arr[0] = add;
			arr[1] = add;
		}
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
		}
		System.out.println(sum);
	}
}