import java.io.*;

public class Main {
    public static int n;
    public static char[][] arr;
    public static int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        //지뢰 위치 파악
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(Character.isDigit(arr[i][j])){
                    int cur = arr[i][j] - '0';
                    findBomb(i, j, cur);
                }
            }
        }


//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                //지뢰가 있거나 있을 수 있다면
                if(arr[i][j] == '*' || arr[i][j] == '#'){
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }

    private static void findBomb(int x, int y, int cur) {

        for(int i = 0; i < 8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

            //지뢰를 넣을 수 있다면
            if(arr[nx][ny] == '#' && cur != 0){
                arr[nx][ny] = '*';
                cur--;
            }
            //이미 지뢰가 있을 경우
            else if(arr[nx][ny] == '*' && cur != 0){
                cur--;
            }
            //지뢰를 넣을 수 없을 경우: 지뢰가 8방향에 없는 0이기 때문
            else if(arr[nx][ny] == '#' && cur == 0){
                arr[nx][ny] = '-';
            }
        }

    }
}
