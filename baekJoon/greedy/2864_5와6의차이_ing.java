import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        
        int minN1 = n1;
        int maxN1 = n1;
        
        for(int i = 0; i < s1.length(); i++){
            
            if(s1.charAt(i) == '5'){
                
               s1 = s1.substring(0, i) + '6' + s1.substring(i+1, s1.length());
               int tmpN1 = Integer.parseInt(s1);
               maxN1 = Math.max(maxN1, tmpN1);
            }
        }
        
        for(int i = 0; i < s1.length(); i++){
            
            if(s1.charAt(i) == '6'){
                
            	s1 = s1.substring(0, i) + '5' + s1.substring(i+1, s1.length());
                int tmpN1 = Integer.parseInt(s1);
                minN1 = Math.min(minN1, tmpN1);
            }
        }
        
        System.out.println("minN1: " + minN1 + ", maxN1: " + maxN1);
        
        
        int minN2 = n2;
        int maxN2 = n2;
        
        for(int i = 0; i < s2.length(); i++) {
        	
        	if(s2.charAt(i) == '5'){      
                
                s2 = s2.substring(0, i) + '6' + s2.substring(i+1, s2.length());
                int tmpN2 = Integer.parseInt(s2);
                
                maxN2 = Math.max(maxN2, tmpN2);
             }
        	
        }
        
        for(int i = 0; i < s2.length(); i++) {
        	
        	if(s2.charAt(i) == '6'){
                 
            	 s2 = s2.substring(0, i) + '5' + s2.substring(i+1, s2.length());
                 int tmpN2 = Integer.parseInt(s2);
                 
                 minN2 = Math.min(minN2, tmpN2);
                 
             }
        	
        }
        
       System.out.println("minN1: " + minN1 + ", maxN1: " + maxN1);
       System.out.println("minN2: " + minN2 + ", maxN2: " + maxN2);
       
        
       int minAnswer = minN1 + minN2;
       int maxAnswer = maxN1 + maxN2;
       System.out.println(minAnswer + " " + maxAnswer);
	
	}
}
