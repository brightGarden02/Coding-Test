import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());
        Integer[] DArray = new Integer[n];
        for(int i = 0; i < n; i++){
            DArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(DArray, Collections.reverseOrder());

        int maxPizzaCal = C / A;

        int k = 1;
        int sumDCal = 0;
        int onePizzaCal = 0;
        for(int i = 0; i < n; i++){

            int pizzaPrice = A + B * k;
            sumDCal += DArray[i];
            int pizzaCal = C + sumDCal;

            onePizzaCal = pizzaCal / pizzaPrice;

            k++;
            maxPizzaCal = Math.max(maxPizzaCal, onePizzaCal);

        }

        System.out.println(maxPizzaCal);
    }
}
