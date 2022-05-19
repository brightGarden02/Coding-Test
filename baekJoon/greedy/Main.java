package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int priceArr[];
    static int n, money;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        priceArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            priceArr[i] = Integer.parseInt(st.nextToken());
        }

        money = Integer.parseInt(br.readLine());

        int[] ans = new int[100];
        int cost = 0;
        int idx = 0;

        //최소 가격의 인덱스 찾기
        //최소 가격의 인덱스 숫자로 가장 긴 숫자 만들기 위함
        int minIdx = findMin(0);


        //index 0이 최소 숫자라면
        if(minIdx == 0){

            //최소 가격의 인덱스 찾기
            minIdx = findMin(1);

            //두번째로 최소 가격의 숫자를 살 수 있다면 가장 앞에 넣기
            if(priceArr[minIdx] <= money){
                ans[idx] = minIdx;
                idx++;

                cost += priceArr[minIdx];
                minIdx = 0;
            }
            else{ //두번째로 최소 가격의 숫자 인덱스를 살 수 없다면
                System.out.println(0);
                return;
            }
        }


        while(cost + priceArr[minIdx] <= money){
            ans[idx] = minIdx;
            idx++;

            cost += priceArr[minIdx];
        }


        //가장 앞에서부터 큰 숫자 교체 시도
        for(int i = 0; i < idx; i++){
            for(int j = n -1; j >= 0; j--){

                if(cost - priceArr[ans[i]] + priceArr[j] <= money){
                    cost = cost - priceArr[ans[i]] + priceArr[j];
                    ans[i] = j;
                    break;
                }
            }

        }


        for(int i = 0; i < idx; i++){
            System.out.print(ans[i]);
        }

    }

    private static int findMin(int start) {

        int minIdx = 0, min = Integer.MAX_VALUE;
        for(int i = start; i < n; i++){
            if(min > priceArr[i]){
                min = priceArr[i];
                minIdx = i;
            }
        }

        return minIdx;
    }
}