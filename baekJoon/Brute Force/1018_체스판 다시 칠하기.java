package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int m, n;
    static char[][] board;
    static char[][] chess;
    static List<Integer> list;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        board = new char[m][n];
        list = new ArrayList<>();

        String str = "";
        for(int i = 0; i < m; i++){
            str = br.readLine();
            for(int j = 0; j < n; j++){
                board[i][j] = str.charAt(j);
            }
        }


        for(int i = 0; i < m - 7; i++){
            for(int j = 0; j < n - 7; j++){
                solve(i, j);
            }
        }

        int minChanged = Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
            minChanged = Math.min(list.get(i), minChanged);
        }

        System.out.println(minChanged);
    }

    private static void solve(int x, int y) {

        chess = new char[8][8];
        for(int a = x, i = 0; a < x + 8 && i < 8; a++, i++){
            for(int b = y, j = 0; b < y + 8 && j < 8; b++, j++){
                chess[i][j] = board[a][b];
            }
        }

        int B_count1 = 0;
        int W_count1 = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){

                if(i % 2 == 0){
                    if(j % 2 == 0 && (chess[i][j] == 'W')){
                        B_count1++;
                    }
                    else if(j % 2 != 0 && chess[i][j] == 'B'){
                        W_count1++;
                    }
                }
                else{
                    if(j % 2 == 0 && chess[i][j] == 'B'){
                        W_count1++;
                    }
                    else if (j % 2 != 0 && chess[i][j] == 'W'){
                        B_count1++;
                    }
                }
            }
        }
        int minChanged = B_count1 + W_count1;
        B_count1 = 0;
        W_count1 = 0;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){

                if(i % 2 == 0){
                    if(j % 2 == 0 && chess[i][j] == 'B'){
                        W_count1++;
                    }
                    else if(j % 2 != 0 && chess[i][j] == 'W'){
                        B_count1++;
                    }
                }
                else{
                    if(j % 2 == 0 && chess[i][j] == 'W'){
                        B_count1++;
                    }
                    else if(j % 2 != 0 && chess[i][j] == 'B'){
                        W_count1++;
                    }
                }
            }
        }

        minChanged = Math.min(minChanged, B_count1 + W_count1);
        list.add(minChanged);
    }
}
