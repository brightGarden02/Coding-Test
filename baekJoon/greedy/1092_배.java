import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> crainList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            crainList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(crainList, Collections.reverseOrder());

        int m = Integer.parseInt(br.readLine());
        List<Integer> boxList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++){
            boxList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(boxList, Collections.reverseOrder());


        int answer = 0;
        if(crainList.get(0) < boxList.get(0)) System.out.println(-1);
        else{

            while(!boxList.isEmpty()){
                int boxIdx = 0;
                int crainIdx = 0;
                while(crainIdx < crainList.size()){

                    if(boxIdx == boxList.size()){
                        break;
                    }
                    else if(crainList.get(crainIdx) >= boxList.get(boxIdx)){
                        boxList.remove(boxIdx);
                        crainIdx++;
                    }
                    else {
                        boxIdx++;
                    }

                }
                answer++;
            }

            System.out.println(answer);
        }

    }
}
