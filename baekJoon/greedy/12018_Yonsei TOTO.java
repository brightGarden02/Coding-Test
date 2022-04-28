import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int subjects = Integer.parseInt(st1.nextToken());
        int mileages = Integer.parseInt(st1.nextToken());

        int[] arr = new int[subjects];
        for(int i = 0; i < subjects; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int registeredStudents = Integer.parseInt(st2.nextToken());
            int maxStudents = Integer.parseInt(st2.nextToken());
            Integer[] mileagesArr = new Integer[registeredStudents];

            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for(int j = 0; j < registeredStudents; j++){
                mileagesArr[j] = Integer.parseInt(st3.nextToken());
            }
            Arrays.sort(mileagesArr, Collections.reverseOrder());

            if(registeredStudents >= maxStudents - 1){
                arr[i] = mileagesArr[maxStudents-1];
            }
            else{
                arr[i] = 1;
            }


        }

        Arrays.sort(arr);
        int answer = 0;

        for(int m : arr){

            mileages -= m;
            if(mileages >= 0){
                answer++;
            }
            else{
                break;
            }
        }
        System.out.println(answer);


    }
}
