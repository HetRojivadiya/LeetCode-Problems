/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        while (headA != null) {
            ListNode tempB = headB; 
            while (tempB != null) {
                if (headA == tempB) {
                    return headA; 
                }
                tempB = tempB.next;
            }
            headA = headA.next;
        }
        return null;
        
        
    }
}