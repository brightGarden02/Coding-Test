package coding_test0405;

import java.util.Scanner;
import java.util.ArrayList;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int[] milk = {0, 1, 2};
        
        int j = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == milk[j]){
                ans++;
                j++;
            }
            if(j == 3){
                j = 0;
            }
        }
        
        System.out.println(ans);
	}

}
