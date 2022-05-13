package codingMain;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[50002];

        int answer = 0;
        for(int i = 0; i < n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = y;

        }

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= n; i++){


            while(!stack.isEmpty() && stack.peek() > arr[i]){
                answer++;
                stack.pop();
            }

            if(!stack.isEmpty() && stack.peek() == arr[i]){
                continue;
            }
            stack.push(arr[i]);

        }


        System.out.println(answer);
    }
}