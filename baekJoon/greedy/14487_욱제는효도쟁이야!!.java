import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int answer = 0;
        int maxVal = 0;
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
            maxVal = Math.max(maxVal, arr[i]);
        }
        answer -= maxVal;
        System.out.println(answer);
    }
}
