package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; ; i++){

            if(i >= n && isPrime(i) && isPalindrome(i)) {
                System.out.println(i);
                break;
            }

        }

    }

    private static boolean isPalindrome(int n) {

        String str = Integer.toString(n);
        int left = 0;
        int right = str.length()-1;

        while(left < right){

            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }

        return true;
    }

    private static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i * i  <= n; i++){

            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
