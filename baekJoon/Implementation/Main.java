package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date d = new Date();
        System.out.println(format.format(d));

        String str = br.readLine();

        int l = 0;
        int r = str.length()-1;


        // 1. 3, 4, 7 => 삭제
        while(l <= r){

            if(str.charAt(l) == '3' || str.charAt(l) == '4' || str.charAt(l) == '7'){
//                System.out.println("left");
//                System.out.println(str);
//                System.out.println(str.substring(0, l) + " " + str.substring(l));
                str = str.substring(0, l) + str.substring(l+1);
//                System.out.println(str);
                l++;
            }
            else{
                l++;
            }
            if(str.charAt(r) == '3' || str.charAt(r) == '4' || str.charAt(r) == '7'){
//                System.out.println("right");
//                System.out.println(str.substring(0, r) + " " + str.substring(r+1));
                str = str.substring(0, r) + str.substring(r+1);
//                System.out.println(str);
                r--;
            }
            else{
                r--;
            }

//            System.out.println();
        }


        // 6->9 , 9 -> 6

        System.out.println("answer: " + str);




    }
}