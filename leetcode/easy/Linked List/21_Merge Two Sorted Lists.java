class Solution {
    
    ListNode answerNode = new ListNode();
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null && list2 == null)
            return null;
        else if(list1 != null){
            answerNode.val = list1.val;
            list1 = list1.next;
        }
        else{
            answerNode.val = list2.val;
            list2 = list2.next;
        }
        
        
        while(list1 != null || list2 != null){
            
            if(list1 != null){
                insert(list1.val);
                list1 = list1.next;
            }
            if(list2 != null){
                insert(list2.val);
                list2 = list2.next;
            }
        }
        
        return answerNode;
    }
    
    public void insert(int data){
        
        ListNode newNode = new ListNode(data);
        ListNode currNode = answerNode;
        ListNode prevNode = null;
        
        while(currNode != null && data >= currNode.val){
            prevNode = currNode;
            currNode = currNode.next;
        }
        
        if(prevNode == null){
            answerNode = newNode;
        }
        else{
            prevNode.next = newNode;
        }
        newNode.next = currNode;
    }
}