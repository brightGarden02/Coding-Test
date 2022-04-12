package coding_test0405;

import java.util.Arrays;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
*/
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		2
//		10
//		15
		int n = sc.nextInt();
		int[] lopes = new int[n];
		
		int maxWeight = 0;
		for(int i = 0; i < n; i++) {
			lopes[i] = sc.nextInt();
		}
		
		
		Arrays.sort(lopes);
		int j = 1;
		for(int i = n-1; i >= 0; i--) {
			
			lopes[i] = lopes[i] * j;
			maxWeight = Math.max(maxWeight, lopes[i]);
			j++;
		}
		
		System.out.println(maxWeight);
	}
}