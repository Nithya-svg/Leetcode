/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }
        
        ListNode current = head;
        ListNode prev = null;
        
        while(true){
        ListNode check = current;
        for(int i=0; i < k; i++){
            if(check == null){
                return head;
            }
        
        check = check.next; }
        
        
        ListNode last = prev;
        ListNode newend = current;
        ListNode next = current.next;
        
        for(int i=0;current != null && i < k;i++){
            current.next = prev;
            prev= current;
            current= next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newend.next = current;
        if(current == null){
            break;
        }
        prev = newend;
        
    }
        return head;
           
        
    }
}