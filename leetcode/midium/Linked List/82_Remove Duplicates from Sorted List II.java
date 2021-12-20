class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return null;
        
        ListNode first = new ListNode(-1000);
        ListNode prev = new ListNode(-1001);
        ListNode ans = first;
        
        
        while(head != null){
            
            if(((head.next == null) || (head.val != head.next.val))
              && prev.val != head.val){
                
                first.next = head;
                first = first.next; 
            }
            
            prev = head;
            head = head.next;
        }
        
        first.next = null;
        
        return ans.next;
        
    }
}