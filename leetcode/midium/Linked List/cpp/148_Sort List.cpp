/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* sortList(ListNode* head) {
        
        if(head == NULL || head->next == NULL) return head;
        
        ListNode* slow = head;
        ListNode* fast = head->next;
        
        while(fast != NULL && fast->next != NULL){
            
            slow = slow->next;
            fast = fast->next->next;
        }
        
        ListNode* newhead = slow->next;
        slow->next = NULL;
        
        
        return mergeSort(sortList(newhead), sortList(head));
    }
    
    ListNode* mergeSort(ListNode* l1, ListNode* l2){
        
        ListNode* result = NULL;
        if(l1 == NULL) return l2;
        if(l2 == NULL) return l1;
        
        if(l1->val <= l2->val){
            l1->next = mergeSort(l1->next, l2);
            result = l1;
        }   
        else{
            l2->next = mergeSort(l1, l2->next);
            result = l2;
        }
        
        return result;
    }
};