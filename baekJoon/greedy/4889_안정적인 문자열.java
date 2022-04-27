import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;

        int j = 1;
        while(true){

            Stack<Character> st = new Stack<>();

            String s = br.readLine();
            if(s.contains("-")) break;
            int n = s.length();
            ans = 0;

            for(int i = 0; i < n; i++){
                char c = s.charAt(i);
                if(c == '{'){
                    st.push('{');
                }
                else{
                    if(st.isEmpty()){
                        ans++;
                        st.push('{');
                    }
                    else{
                        st.pop();
                    }
                }
            }

            ans += st.size()/2;
            System.out.println(j + ". " + ans);
            j++;
        }

    }
}
