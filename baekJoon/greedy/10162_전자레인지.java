import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        boolean success = true;
        while(T > 0){
            
            if(T >= 300){
                n1 += T / 300;
                T = T % 300;
            }
            else if(T >= 60){
                n2 += T / 60;
                T = T % 60;
            }
            else if(T >= 10){
                n3 += T / 10;
                T = T % 10;
            }
            else{
                success = false;
                break;
            }
        }
        if(success == true)
            System.out.println(n1 + " " + n2 + " " + n3);
        else
            System.out.println(-1);
    }
}
