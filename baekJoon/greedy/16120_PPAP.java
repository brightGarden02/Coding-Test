import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        int n = str.length();

        for(int i = 0; i < n; i++){

            char c = str.charAt(i);
            if(c == 'P'){
                stack.push('P');
            }
            else{
                if(stack.size() >= 2 && i < n-1 && str.charAt(i+1) == 'P'){
                    stack.pop();
                    stack.pop();
                }
                else{
                    System.out.println("NP");
                    return;
                }

            }
        }

        if(stack.size() == 1){
            System.out.println("PPAP");
        }
        else{
            System.out.println("NP");
        }

    }
}
