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
    public boolean isPalindrome(ListNode head) {


        ListNode mid = middleNode(head);
        ListNode secondhead = reverseList(mid);
        ListNode rereverse = secondhead;
        while(head != null && secondhead != null){
            if(head.val != secondhead.val){
                break;
            }
            head = head.next;
            secondhead = secondhead.next;

        }
        reverseList(rereverse);
        return head == null|| secondhead == null;
    }
        public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        
        while(present != null){

            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present =next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;

    }
    public ListNode middleNode(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;
     while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
     }   
     return slow;
    }

    }
