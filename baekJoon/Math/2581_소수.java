package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    private static PriorityQueue<Integer> pq = new PriorityQueue<>();
    private static int sum;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for(int i = m; i <= n; i++){
            isPrime(i);
        }



        if(pq.isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(pq.poll());
        }
    }

    private static void isPrime(int number) {

        if(number == 1){
            return;
        }

        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return;
            }
        }

        sum += number;
        pq.add(number);

    }
}
