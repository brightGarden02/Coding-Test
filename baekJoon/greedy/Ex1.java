package coding_test0405;

import java.util.Scanner;
import java.util.ArrayList;

class Edge<W, V> {
	
	private W weight;
	private V v;
	
	public void setEdge(W weight, V v) {
		
		this.weight = weight;
		this.v = v;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        
		Scanner sc = new Scanner(System.in);
        
        int submitMoney = 1;
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
            else if(remMoney >= 1){
                answer += remMoney / 1;
                remMoney = remMoney % 1;
            }
            System.out.println("answer: " + answer);
        }
        System.out.println(answer);
        
        
		
	}

}
