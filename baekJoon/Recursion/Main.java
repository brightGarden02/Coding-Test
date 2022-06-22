package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int[][] img;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        img = new int[N][N];

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            for(int j = 0; j < N; j++) {
                img[i][j] = str.charAt(j) - '0';
            }
        }

        QuadTree(0, 0, N);
        System.out.println(sb);

    }

    private static void QuadTree(int x, int y, int size) {

        //압축 가능할 경우, 하나의 색상으로 압축
        if(isSame(x, y, size)){
            sb.append(img[x][y]);
            return;
        }

        //압축 불가능할 경우, 사이즈를 절반으로
        int newSize = size / 2;

        //각 레벨(depth)에서 여는 괄호로 시작
        sb.append('(');

        //왼쪽 위
        QuadTree(x, y, newSize);

        //오른쪽 위
        QuadTree(x, y + newSize, newSize);

        //왼쪽 아래
        QuadTree(x + newSize, y, newSize);

        //오른쪽 아래
        QuadTree(x + newSize, y + newSize, newSize);


        sb.append(')');
    }

    /*
        압축 가능한지 해당 공간 체크하는 함수
     */
    private static boolean isSame(int x, int y, int size) {

        int val = img[x][y];

        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(val != img[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}