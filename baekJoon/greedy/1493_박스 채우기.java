import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] box, cube;
    static long fullVolume;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        box = new int[3];
        fullVolume = 1;

        for(int i = 0; i < 3; i++) {
            box[i] = Integer.parseInt(st.nextToken());
            fullVolume *= box[i];
        }

        int n = Integer.parseInt(br.readLine());

        cube = new int[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int n_sqr = Integer.parseInt(st.nextToken());
            int cubeNums = Integer.parseInt(st.nextToken());

            cube[n_sqr] = cubeNums;
        }

        System.out.println(solve(n-1, 0, 0));

    }

    static long solve(int blockSize, long fill, long count) {

        long totalVolume = 1;
        for(int i = 0; i < 3; i++) {
            totalVolume *= box[i] >> blockSize;
        }

        int curCube = cube[blockSize];

        totalVolume -= fill;

        long fillCube = Math.min(curCube, totalVolume);
        if(blockSize == 0) {

            if((fill + fillCube) != Main.fullVolume) {
                return -1;
            }
            else{
                return count + fillCube;
            }

        }else {
            return solve(blockSize-1, fill + fillCube << 3, count + fillCube);
        }

    }
}
