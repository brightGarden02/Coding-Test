package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int n;
    private static int[][] matrix;

    private static int zeroCount;
    private static int oneCount;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partiton(0, 0, n);
        System.out.println(zeroCount);
        System.out.println(oneCount);
    }

    private static void partiton(int r, int c, int size) {

        if(isAllSameNumber(r, c, size)){

            if(matrix[r][c] == 0){
                zeroCount++;
            }
            else if(matrix[r][c] == 1){
                oneCount++;
            }

            return;
        }

        int newSize = size/2;
        partiton(r, c, newSize);
        partiton(r, c + newSize, newSize);

        partiton(r + newSize, c, newSize);
        partiton(r + newSize, c + newSize, newSize);

    }

    private static boolean isAllSameNumber(int r, int c, int size) {

        int color = matrix[r][c];
        for(int i = r; i < r + size; i++){
            for(int j = c; j < c + size; j++){
                if(matrix[i][j] != color){
                    return false;
                }
            }
        }

        return true;
    }
}