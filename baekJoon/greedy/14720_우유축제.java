import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
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
