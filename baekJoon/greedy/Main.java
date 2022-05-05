package codingMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int ans = 0;
        int maxVal = n;
        for(int i = 0; i < n-1; i++){

            int idx = list.indexOf(maxVal);
            if(idx == 0){
                ans += list.get(idx) - list.get(idx + 1);
            }
            else if(idx == list.size()-1){
                ans += list.get(idx) - list.get(idx - 1);
            }
            else{
                ans += Math.min(list.get(idx) - list.get(idx-1),
                        list.get(idx) - list.get(idx+1));
            }

            list.remove(idx);
            maxVal--;
        }

        System.out.println(ans);
    }
}