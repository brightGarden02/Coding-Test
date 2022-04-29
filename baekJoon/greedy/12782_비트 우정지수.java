import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            int m = s1.length();

            for(int j = 0; j < m; j++){
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);
                if(c1 != c2){
                    map.put(c1, map.getOrDefault(c1, 0) + 1);
                }
            }
            int zeroCount = 0;
            int oneCount = 0;

            for(char key : map.keySet()){
                if(key == '0'){
                    zeroCount = map.get('0');
                }
                else{
                    oneCount = map.get('1');
                }
            }

            while(zeroCount > 0 && oneCount > 0){
                ans++;
                zeroCount--;
                oneCount--;
            }
            while(zeroCount > 0){
                ans++;
                zeroCount--;
            }
            while(oneCount > 0){
                ans++;
                oneCount--;
            }


            System.out.println(ans);
        }

    }
}
