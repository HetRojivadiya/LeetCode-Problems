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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode();
        ListNode ptr = head;

        int c = 0;

        while(l1!=null || l2!=null)
        {   
            int sum=0;
            if(l1!=null && l2!=null)
            {
                sum = l1.val+l2.val;
                l1=l1.next;
                l2=l2.next;
            }else if(l2==null)
            {
                sum = l1.val;
                l1=l1.next;
            }else{
                sum = l2.val;
                l2=l2.next;
            }
           
            
            sum=sum+c;

            if(sum>9)
            {
                c=sum/10;
                sum=sum%10;
            }else{
                c=0;
            }
            
            ListNode nn = new ListNode(sum,null);
            ptr.next = nn;
            ptr=ptr.next;
        }

        if(c!=0)
        {
            ListNode nn = new ListNode(c,null);
            ptr.next = nn;
        }

        return head.next;
    }
}