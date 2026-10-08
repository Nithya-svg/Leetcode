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
    public ListNode sortList(ListNode head) {
        if(head  == null || head.next == null){
                  return head;
        }
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
           
        }
        int mid = length/2; 
        temp = head;
        for(int i=1; i < mid;i++){
            temp = temp.next;
        }
        ListNode right = temp.next;
        temp.next = null;

        ListNode left = sortList(head);
        right = sortList(right);


        return merge(left,right);
    }
     private ListNode merge(ListNode left, ListNode right) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {

            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }

            current = current.next;
        }

        if (left != null) {
            current.next = left;
        }

        if (right != null) {
            current.next = right;
        }

        return dummy.next;
}
}