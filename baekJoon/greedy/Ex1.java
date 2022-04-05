package coding_test0405;

import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        
		Scanner sc = new Scanner(System.in);
 
        int n = 3;
		int[] arr = {124, 25, 194};
        
        
        int quarter_nums = 0;
        int dime_nums = 0;
        int nickel_nums= 0;
        int penny_nums = 0;
        
        for(int i = 0; i < n; i++){
            
            int tmpMoney = arr[i];
            while(tmpMoney > 0){
                
                if(tmpMoney >= 25){
                    quarter_nums += tmpMoney / 25;
                    tmpMoney = tmpMoney % 25;
                }
                else if(tmpMoney >= 10){
                    dime_nums += tmpMoney / 10;
                    tmpMoney = tmpMoney % 10;
                }
                else if(tmpMoney >= 5){
                    nickel_nums += tmpMoney / 5;
                    tmpMoney = tmpMoney % 5;
                }
                else if(tmpMoney >= 1){
                    penny_nums += tmpMoney / 1;
                    tmpMoney = tmpMoney % 1;
                }
                
            }
            
        }
        
		System.out.println(quarter_nums + " " + dime_nums + " " + nickel_nums + " "+ penny_nums);
	
	}

}
