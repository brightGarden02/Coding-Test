import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            int val = scanner.nextInt();
            arr[i] = val;
        }
        
        Arrays.sort(arr);
        int answer = 0;
        int tmpN = n;
        for(int i = 0; i < n; i++){
            answer += arr[i] * tmpN;
            tmpN--;
        }
        
        System.out.println(answer);
    }
}
