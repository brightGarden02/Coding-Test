class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int plusOne = 0;
        
        while(l1 != null || l2 != null || plusOne == 1){
            
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            sum += plusOne;
            plusOne = sum / 10;
            
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
            
        }
        
        return ans.next;
    }
}