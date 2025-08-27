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
        ListNode ans=null;
        ListNode last=null;
        int borrow=0;
        while(l1!=null && l2!=null)
        {
            int sum=l1.val+l2.val+borrow;
            if(sum>=10)
            {
                sum-=10;
                borrow=1;
            }
            else
            {
                borrow=0;
            }
            if(ans==null)
            {
                ans=new ListNode(sum,null);
                last=ans;
            }
            else
            {
                last.next=new ListNode(sum,null);
                last=last.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            int sum=l1.val+borrow;
            if(sum>=10)
            {
                sum-=10;
                borrow=1;
            }
            else
            {
                borrow=0;
            }
            if(ans==null)
            {
                ans=new ListNode(sum,null);
                last=ans;
            }
            else
            {
                last.next=new ListNode(sum,null);
                last=last.next;
            }
            l1=l1.next;
        }
        while(l2!=null)
        {
            int sum=l2.val+borrow;
            if(sum>=10)
            {
                sum-=10;
                borrow=1;
            }
            else
            {
                borrow=0;
            }
            if(ans==null)
            {
                ans=new ListNode(sum,null);
                last=ans;
            }
            else
            {
                last.next=new ListNode(sum,null);
                last=last.next;
            }
            l2=l2.next;
        }
        if(borrow==1)
        {
            last.next=new ListNode(1,null);
        }
        return ans;
    }
}