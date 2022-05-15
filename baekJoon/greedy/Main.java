package codingTest;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        long x = 0;
        long a = 0;
        long total = 0;
        Vector<pair> v = new Vector<pair>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x = Long.parseLong(st.nextToken());
            a = Long.parseLong(st.nextToken());
            v.add(new pair(x, a));

            total += a;

        }

        Collections.sort(v, new Comparator<pair>() {
            public int compare(pair p1, pair p2) {
                if(p1.first < p2.first) {
                    return -1;
                }
                else if(p1.first == p2.first) {
                    if(p1.second < p2.second) {
                        return -1;
                    }
                }
                return 1;
            }
        });

        long people = 0;

        for(pair p : v) {
            people += p.second;
            if(people >= (total + 1) / 2) {
                System.out.println(p.first);
                break;
            }
        }

    }
}

class pair{
    long first, second;
    pair(long x, long a) {
        this.first = x;
        this.second = a;
    }
}