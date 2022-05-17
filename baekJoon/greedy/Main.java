package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int capacity = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        List<Node> list = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());

            int send = Integer.parseInt(st.nextToken());
            int got = Integer.parseInt(st.nextToken());
            int boxes = Integer.parseInt(st.nextToken());



        }


    }
}
