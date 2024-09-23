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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head; 
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode next_n = null;

        while(curr!=null)
        {
            next_n=curr.next;
            curr.next=prev;
            prev = curr;
            curr = next_n;
        }

        return prev;
        }
}