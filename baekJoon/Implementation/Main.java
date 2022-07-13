package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        List<String> list = new ArrayList<>();

        list.add("c=");
        list.add("c-");
        list.add("dz=");
        list.add("d-");

        list.add("lj");
        list.add("nj");
        list.add("s=");
        list.add("z=");


        int ans = 0;
        boolean flag = false;
        for(int i = 0; i < str.length()-2; i++){

            String tmp = str.substring(i, i+3);

            if(list.contains(tmp)){
                ans++;
                flag = true;
            }
        }

        if(flag){
            list.remove("dz=");
        }


        int i = 0;
        for(; i < str.length()-1; i++){

            String tmp = str.substring(i, i+2);

            if(list.contains(tmp)){
                ans++;
                i++;
            }
            else{

                if(tmp.equals("dz")){
                    if(i < str.length()-2 && str.substring(i, i+3).equals("dz=")){
                        i += 2;
                        continue;
                    }
                }

                ans++;
            }
        }


        if(i == str.length()-1){
            ans++;
            System.out.println(ans);
            return;
        }

        System.out.println(ans);
    }
}