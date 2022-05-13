import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int lectureNumber = 0;
        int start = 0;
        int end = 0;

        List<Node> list = new ArrayList<>();
        for(int i = 0; i < n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                lectureNumber = Integer.parseInt(st.nextToken());
                start = Integer.parseInt(st.nextToken());
                end = Integer.parseInt(st.nextToken());
            }
            list.add(new Node(lectureNumber, start, end));
        }

        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.start, o2.start);
            }
        });


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int answer = 0;
        int i = 0;
        while(i < n){

            if(!pq.isEmpty()  && list.get(i).start >= pq.peek()){
                pq.poll();
            }
            pq.add(list.get(i).end);
            answer = Math.max(answer, pq.size());
            i++;
        }

        System.out.println(answer);

    }

    public static class Node{
        int lectureNumber, start, end;
        Node(int lectureNumber, int start, int end){
            this.lectureNumber = lectureNumber;
            this.start = start;
            this.end = end;
        }
    }
}
