package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "tebbem";
        bw.write(validPalindrome(s) + "\n");


        bw.flush();
        bw.close();
        br.close();
    }


    public static boolean validPalindrome(String s) {

        int n = s.length();
        int l = 0, r = n-1;
        while(l < r){

            if(s.charAt(l) != s.charAt(r)){

                String newString = deleteChar(s, l);

                if(isPalindrome(newString)) return true;

                newString = deleteChar(s, r);

                return (isPalindrome(newString));
            }

            l++;
            r--;
        }

        return false;
    }

    private static boolean isPalindrome(String newString) {

        int l = 0;
        int r = newString.length()-1;
        while(l < r){
            if(newString.charAt(l) != newString.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }

    private static String deleteChar(String s, int deleteIdx) {

        String newString = "";
        int n = s.length();
        newString += s.substring(0, deleteIdx);
        newString += s.substring(deleteIdx+1, n);

        return newString;
    }
}