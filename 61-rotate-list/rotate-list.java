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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null) return head;
        ListNode curr=head;
        int length=1;
        while(curr.next!=null)
        {
            curr=curr.next;
            length++;
        }
        if(k%length==0) return head;
        k=k%length;
        curr.next=head;
        curr=head;
        int i=1;
        while(curr!=null)
        {
            if(i==length-k) break;
            i++;
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
}