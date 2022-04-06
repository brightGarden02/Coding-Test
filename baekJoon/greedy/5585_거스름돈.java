import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        
        int submitMoney = sc.nextInt();
        int remMoney = 1000 - submitMoney;
        
        int answer = 0;
        while(remMoney > 0){
            
            if(remMoney >= 500){
                answer += remMoney / 500;
                remMoney = remMoney % 500;
            }
            else if(remMoney >= 100){
                answer += remMoney / 100;
                remMoney = remMoney % 100;
            }
            else if(remMoney >= 50){
                answer += remMoney / 50;
                remMoney = remMoney % 50;
            }
            else if(remMoney >= 10){
                answer += remMoney / 10;
                remMoney = remMoney % 10;
            }
            else if(remMoney >= 5){
                answer += remMoney / 5;
                remMoney = remMoney % 5;
            }
            else if(remMoney >= 1){
                answer += remMoney / 1;
                remMoney = remMoney % 1;
            }
        }
        System.out.println(answer);
        
    }

}
