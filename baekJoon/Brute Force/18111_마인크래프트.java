package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());

                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
        }

        int time = Integer.MAX_VALUE;
        int height = -1;

        for(int i = min; i <= max; i++){

            int seconds = 0;
            int inventory = B;

            for(int j = 0; j < arr.length; j++){
                for(int k = 0; k < arr[j].length; k++){

                    int diff = arr[j][k] - i;

                    //블록 제거하여 인벤토리에 넣음
                    if(diff > 0){
                        seconds += Math.abs(diff) * 2;
                        inventory += Math.abs(diff);
                    }
                    else if(diff < 0){ //인벤토리에서 꺼내서 좌표 위 블록위에 놓음
                        seconds += Math.abs(diff);
                        inventory -= Math.abs(diff);

                    }
                }
            }


            if(inventory >= 0){
                if(seconds <= time){
                    time = seconds;
                    height = i;
                }
            }
        }

        System.out.println(time + " " + height);

    }
}
