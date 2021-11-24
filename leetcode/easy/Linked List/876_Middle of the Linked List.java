class Solution {
    public ListNode middleNode(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode tmp = head;
        int length = 0;
        while(tmp != null){
            tmp = tmp.next;
            length++;
        }
        
        tmp = head;
        for(int i = 0; i < length/2; i++){
            tmp = tmp.next;
        }
        return tmp;
    }
}
