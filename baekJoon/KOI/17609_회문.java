// 회문이면 0, 유사 회문이면 1, 둘 모두 아니면 2
import java.util.Scanner;

public class Main {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        
    }
    
    public boolean isPalindrome(String str){
        
        int p = 0;
        int q = str.length()-1;
        while(p < q){
            if(str.charAt(p) != str.charAt(q)){
                return false;
            }
        }
        return true;
    }
}