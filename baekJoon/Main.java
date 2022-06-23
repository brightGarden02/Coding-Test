package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static Set<Integer> set = new HashSet<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            String[] arr = br.readLine().split(" ");

            String operator = arr[0];

            if(arr.length != 1) {

                int operand = Integer.parseInt(arr[1]);

                switch(operator) {
                    case "add" :
                        add(operand);
                        break;
                    case "remove":
                        remove(operand);
                        break;
                    case "check":
                        sb.append(check(operand) + "\n");
                        break;
                    case "toggle":
                        toggle(operand);
                        break;
                    default:
                        break;
                }
            }else {
                switch(operator) {
                    case "all":
                        all();
                        break;
                    case "empty":
                        empty();
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println(sb);

    }

    private static void add(int value) {
        set.add(value);
    }

    private static void remove(int value) {
        if(set.contains(value)) set.remove(value);
    }

    private static int check(int value) {
        if(set.contains(value)) return 1;
        else return 0;
    }

    private static void toggle(int value) {
        if(set.contains(value)) {
            remove(value);
        }else {
            add(value);
        }
    }

    private static void all() {
        for(int i = 1; i <= 20; i++){
            add(i);
        }
    }

    private static void empty() {
        set.clear();
    }
}