public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        
        while(slow != null && fast.next != null && fast.next.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow.val == fast.val){
                cycle = true;
                break;
            }
        }
        
        if(cycle == false) return null;
        
        ListNode curr = head;
        while(curr != fast){
            curr = curr.next;
            fast = fast.next;
        }
        
        return curr;
    }
}