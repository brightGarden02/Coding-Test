import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            st.push(Integer.parseInt(br.readLine()));
        }

        while(!st.isEmpty()){

            int tmp = st.pop();
            if(tmp == n){
                n--;
            }
            else{
                ans++;
            }
        }


        System.out.println(ans);
    }
}
