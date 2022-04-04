import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
        // 1. n1, n2를 String으로 변환
        // 2. String에서 5, 6인 것을 확인
        // 3. 5를 확인했으면 ArrayList에 넣고
        // 4. tmp에 5를 6으로 바꾸고 ArrayList에 넣기
        // 5. 순서 3번, 4번을 6일 경우에도 반복
        // 6. 또다른 ArrayList 만들어서 순서 3,4,5번 반복
        // 7. for문 2개로 2개의 ArrayList 돌면서 최소값, 최대값 파악
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        String s1 = Integer.toString(n1);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(n1);
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == '5'){
               al.add 
            }
            else if(s1.charAt(i) == '6'){
                
            }
        }
        
        
        int answer = 0;
        
        System.out.println(answer);
	}
}
