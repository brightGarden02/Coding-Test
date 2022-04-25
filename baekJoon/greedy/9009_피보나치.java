import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		for(int i = 0; i < n; i++) {
			
			int data = arr[i];
			ArrayList<Integer> al = new ArrayList<>();
			
			al = fibo(al, data);
			Collections.sort(al);
			
			for(int j = 0; j < al.size(); j++) {
				System.out.print(al.get(j) + " ");
			}
			System.out.println();
			
		}
		
	}
	
	public static ArrayList<Integer> fibo(ArrayList<Integer> al, int data) {
		
		int f0 = 0;
		int f1 = 1;
		int f2 = 0;
		
		while(f2 <= data) {
			
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			
		}
		
		al.add(f0);
		
		data = data - f0;
		if(data > 0) {
			fibo(al, data);
		}
		
		return al;
	}
}
