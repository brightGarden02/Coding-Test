import java.util.Scanner;

public class Main {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        
        int numbers = sc.nextInt();
        int[] array = new int[numbers];
        
        for(int i = 0; i < array.length; i++){
          array[i] = sc.nextInt();
        }
        
        int maxHeight = array[array.length-1];
        int answer = 1;
        for(int i = numbers-2; i >= 0; i--){
            if(array[i] > maxHeight){
                answer++;
                maxHeight = array[i];
            }
        }
        System.out.println(answer);
    }
}