import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Flower[] flowers = new Flower[n];


        for(int i = 0; i < n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int startMonth = Integer.parseInt(st.nextToken());
            int startDay = Integer.parseInt(st.nextToken());
            int endMonth = Integer.parseInt(st.nextToken());
            int endDay = Integer.parseInt(st.nextToken());

            int start = startMonth * 100 + startDay;
            int end = endMonth * 100 + endDay;

            flowers[i] = new Flower(start, end);
        }

        Arrays.parallelSort(flowers);


        int start = 301, end = 1201;
        int answer = 0;
        int max = 0;
        int idx = 0;

//        for(int i = 0; i < n; i++){
//            System.out.println(flowers[i].start + " " + flowers[i].end);
//        }


        while(start < end){

            boolean isFound = false;
            for(int i = idx; i < n; i++){

                //꽃피는 시기가 원하는 시기보다 늦을 경우
                if(flowers[i].start > start){
                    break;
                }

                //최대 꽃 피어있는 날보다 선택한 꽃 피어있는 날이 길 경우
                if(max < flowers[i].end){
                    isFound = true;
                    max = flowers[i].end;
                    idx = i + 1;
                }

//                System.out.println("f_start: " + flowers[i].start + ", start: " + start +
//                        ", f_end: " + flowers[i].end + ", end: " + end +
//                        ", max: " + max);

            }

            if(isFound){
                start = max;
                answer++;
            }
            else{
                break;
            }

        }

        if(max < end){
            System.out.println(0);
        }
        else{
            System.out.println(answer);
        }


    }
}

class Flower implements Comparable<Flower>{

    int start, end;

    public Flower(int start, int end) {
        this.start = start;
        this.end = end;
    }

    //시작일 낮은 순
    //종료일 높은 순
    @Override
    public int compareTo(Flower f) {

        //시작일 낮은 순
        if(this.start > f.start){
            return 1;
        }
        else if(this.start == f.start){

            //종료일 높은 순
            if(this.end < f.end){
                return 1;
            }
            else if(this.end == f.end){
                return 0;
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }
}
