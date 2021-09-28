import java.util.Scanner;

public class Main {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();

        for(int i = 0; i < numbers; i++){
          int n = sc.nextInt();
          System.out.println(answerRecur(n));
        }

}

public static int answerRecur(int n){
    if(n == 1) return 1;
    else if(n == 2) return 2;
    else if(n == 3) return 4;
    else return answerRecur(n-3) + answerRecur(n-2) + answerRecur(n-1);

    }
}
