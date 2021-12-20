class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode n1 = head;
        ListNode n2 = head.next;
        
        n1.next = swapPairs(head.next.next);
        n2.next = n1;
        
        return n2;
    }
}