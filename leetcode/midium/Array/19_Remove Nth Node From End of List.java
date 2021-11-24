class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode currNode = head;
        
        int count = 1;
        while(currNode.next != null){
            currNode = currNode.next;
            count++;
        }
        int len = count;
        count = count - n;
        
        if(len == n){
            head = head.next;
            return head;
        }
        
        
        currNode = head;
        int i = 1;
        
        while(i < len){
            if(i == count){
                currNode.next = currNode.next.next;
                i++;
            }
            else{
                currNode = currNode.next;    
            }
            i++;
        }
        
        return head;
    }
}