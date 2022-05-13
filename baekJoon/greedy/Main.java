package codingMain;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String number = br.readLine();
        Stack<Integer> stack = new Stack<>();

        stack.push(number.charAt(0) - '0');

        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(int i = 1; i < n; i++){

            int tmp = number.charAt(i) - '0';

            while(!stack.isEmpty() && count < k && stack.peek() < tmp){
                stack.pop();
                count++;
            }
            stack.add(tmp);
        }


        for(int i = 0; i < n-k; i++){
            sb.append(stack.get(i));
        }

        System.out.println(sb);
    }
}