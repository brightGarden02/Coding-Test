package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if(arr[0].equals("0")){
            System.out.println("0");
            return;
        }

        String ans = "";
        for(String s : arr){
            ans += s;
        }

        System.out.println(ans);
    }
}