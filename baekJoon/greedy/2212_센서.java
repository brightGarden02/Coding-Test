import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        Iterator<Integer> iter = set.iterator();
        int[] arr = new int[set.size()];
        int j = 0;
        while(iter.hasNext()){
            arr[j] = iter.next();
            j++;
        }
        Arrays.sort(arr);
        int[] diffArr = new int[set.size()-1];
        for(int i = 0; i < diffArr.length; i++){
            diffArr[i] = arr[i+1] - arr[i];
        }

        Arrays.sort(diffArr);

        int ans = 0;
        for(int i = 0; i < set.size()-k; i++){
            ans += diffArr[i];
        }

        System.out.println(ans);

    }
}
