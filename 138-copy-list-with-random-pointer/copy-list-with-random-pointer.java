/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node curr=head;
        while(curr!=null)
        {
            Node node=new Node(curr.val);
            Node next=curr.next;
            curr.next=node;
            node.next=next;
            curr=next;
        }
        curr=head;
        while(curr!=null)
        {
            if(curr.random!=null) curr.next.random=curr.random.next;
            curr=curr.next.next;
        }
        Node head1=head.next;
        curr=head;
        Node curr1=head1;
        while(curr!=null)
        {
            curr.next=curr1.next;
            curr=curr.next;
            if(curr!=null)
            {
                curr1.next=curr.next;
                curr1=curr1.next;
            }
        }
        return head1;
    }
}