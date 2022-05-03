import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());



        char[][] A = new char[n][m];
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < m; j++){
                A[i][j] = s.charAt(j);
            }
        }

        char[][] B = new char[n][m];
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < m; j++){
                B[i][j] = s.charAt(j);
            }
        }

        int ans = 0;

        if(n < 3 || m < 3){

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){

                    if(A[i][j] != B[i][j]){
                        System.out.println(-1);
                        return;
                    }
                }
            }
            System.out.println(ans);
            return;
        }


        for(int i = 0; i < n-2; i++){
            for(int j = 0; j < m-2; j++){

                if(A[i][j] != B[i][j]){
                    A = change3X3(A, n, m, i, j);
                    ans++;
                }
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(A[i][j] != B[i][j]){
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(ans);
    }

    private static char[][] change3X3(char[][] A, int n, int m, int x, int y) {

        for(int i = x; i < x+3; i++){

            for(int j = y; j < y+3; j++){

                if(A[i][j] == '1'){
                    A[i][j] = '0';
                }
                else {
                    A[i][j] = '1';
                }
            }
        }

        return A;
    }
}
