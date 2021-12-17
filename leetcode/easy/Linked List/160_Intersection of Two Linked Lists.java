public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        
        while(nodeA != nodeB){
            
            if(nodeA == null){
                nodeA = headB;
            }
            else{
                nodeA = nodeA.next;
            }
            
            if(nodeB == null){
                nodeB = headA;
            }
            else{
                nodeB = nodeB.next;
            }
            
        }
        
        return nodeA;
    }
}