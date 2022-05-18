import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //마을 개수
        int n = Integer.parseInt(st.nextToken());

        //트럭의 용량
        int capacity = Integer.parseInt(st.nextToken());

        //보내는 박스 정보의 개수
        int m = Integer.parseInt(br.readLine());
        Delivery[] deliveries = new Delivery[m + 1];

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken()); //보내는 마을 번호
            int end = Integer.parseInt(st.nextToken()); //박스를 받는 마을 번호
            int boxNum = Integer.parseInt(st.nextToken()); //보내는 박스 개수

            deliveries[i] = new Delivery(start, end, boxNum);
        }

        Arrays.sort(deliveries, 1, m + 1);

//        for(int i = 1; i < deliveries.length; i++){
//            Delivery d = deliveries[i];
//            System.out.println(d.start + " " + d.end + " " + d.boxNum);
//        }


        //각 마을당 보낼 수 있는 최대 용량을 산정한다.
        //n: 마을 개수
        int[] capacityArr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            capacityArr[i] = capacity;
        }


//        for(int i = 1; i <= n; i++){
//            System.out.print(capacityArr[i] + " ");
//        }
//        System.out.println();


        int answer = 0;
        for (int i = 1; i <= m; i++) {

            Delivery d = deliveries[i];
            int maxBoxNum = Integer.MAX_VALUE;

            //보내는 마을과 받는 마을 사이의 경로 마을 중에서 보낼 수 있는 최대 한도를 구한다.
            for (int j = d.start; j < d.end; j++) {
                maxBoxNum = Math.min(maxBoxNum, capacityArr[j]);
            }

            //위에서 구한 보낼 수 있는 최대 한도가 더 크다면. 현재 보내려는 택배의 개수보다
            //보내는 마을과 받는 마을 사이의 경로 마을 모두 용량에서 현재 보내려는 택배의 개수를 뺀다.
            if (maxBoxNum >= d.boxNum) {
                for (int j = d.start; j < d.end; j++) {
                    capacityArr[j] -= d.boxNum;
                }
                answer += d.boxNum;
            } else {
                //보낼 수 있는 최대 한도보다 현재 보내려는 택배의 개수가 클 경우,
                //현재 보내려는 택배의 개수가 아닌 위에서 구한 최대 한도를 기준으로 한다.
                for (int j = d.start; j < d.end; j++) {
                    capacityArr[j] -= maxBoxNum;
                }
                answer += maxBoxNum;
            }

        }

        System.out.println(answer);
    }
}
class Delivery implements Comparable<Delivery> {

    int start;
    int end;
    int boxNum;

    Delivery(int start, int end, int boxNum){
        this.start = start;
        this.end = end;
        this.boxNum = boxNum;
    }

    //받는 마을 오름차순 정렬
    //단, 받는 마을이 같을 시 보내는 마을 오름차순 정렬
    @Override
    public int compareTo(Delivery o) {
        if(end == o.end){
            return start - o.start;
        }
        else{
            return end - o.end;
        }
    }
}
