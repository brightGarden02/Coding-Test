class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode curr1 = list1;
        for(int i = 0; i < a-1; i++){
            curr1 = curr1.next;
        }
        
        ListNode mid = list2;
        while(mid.next != null){
            mid = mid.next;
        }
        
        ListNode curr2 = list1;
        for(int i = 0; i <= b; i++){
            curr2 = curr2.next;
        }
        
        curr1.next = list2;
        mid.next = curr2;
        
        return list1;
    }
}