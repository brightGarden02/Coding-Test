import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        
        int answer = 0;
        for(int i = 0; i < 2*n; i++){
            int tmp = sc.nextInt();
            answer += Math.abs(tmp);
        }
         
        System.out.println(answer);
    }
}   
