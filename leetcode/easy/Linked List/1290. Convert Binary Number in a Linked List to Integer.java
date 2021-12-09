class Solution {
    public int getDecimalValue(ListNode head) {
        
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            
            curr = curr.next;
            len++;
        }
        
        len--;
        int answer = 0;
        int tmp = 0;
        while(head != null){
            tmp = head.val * (int)Math.pow(2, len);
            answer += tmp;
            
            head = head.next;
            len--;
        }
        
        return answer;
    }
}