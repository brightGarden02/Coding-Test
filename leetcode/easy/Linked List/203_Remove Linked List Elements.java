class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode curr = head;
        if(head == null) return head;
            
        while(curr.next != null){
            
            if(curr.next.val == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        
        if(head.val == val) {
            return head.next;
        }
        return head;
    }
}