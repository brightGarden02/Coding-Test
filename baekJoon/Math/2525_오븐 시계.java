package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        int tmpMin = Integer.parseInt(br.readLine());

        int totalMin = calculateHourToMin(hour) + min + tmpMin;

        min = makeMin(totalMin);
        hour = makeHour(totalMin);

        System.out.println(hour + " " + min);
    }

    private static int makeHour(int totalMin) {
        
        int hour = totalMin / 60;
        return hour % 24;
    }

    private static int makeMin(int totalMin) {
        return totalMin % 60;
    }

    private static int calculateHourToMin(int hour) {
        return hour * 60;
    }

}
