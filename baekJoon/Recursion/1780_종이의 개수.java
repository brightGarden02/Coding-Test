package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int[][] matrix;
    private static int minusOneCount = 0;
    private static int zeroCount = 0;
    private static int plusOneCount = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, n);
        System.out.println(minusOneCount);
        System.out.println(zeroCount);
        System.out.println(plusOneCount);

    }

    private static void partition(int row, int col, int size) {

        if(isAllNumberSame(row, col, size)){
            if(matrix[row][col] == -1){
                minusOneCount++;
            }
            else if(matrix[row][col] == 0){
                zeroCount++;
            }
            else {
                plusOneCount++;
            }
            return;
        }

        int newSize = size / 3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + newSize * 2, newSize);

        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize, col + newSize * 2, newSize);

        partition(row + newSize * 2, col, newSize);
        partition(row + newSize * 2, col + newSize, newSize);
        partition(row + newSize * 2, col + newSize * 2, newSize);

    }

    private static boolean isAllNumberSame(int row, int col, int size) {

        int color = matrix[row][col];

        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){
                if(color != matrix[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
