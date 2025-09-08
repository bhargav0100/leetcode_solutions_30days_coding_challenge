class Node{
    int val;
    Node next;
    public Node(int val)
    {
        this.val=val;
    }
    public Node(int val,Node next)
    {
        this(val);
        this.next=next;
    }
}
class MyLinkedList {
    private int count;
    private Node first;
    private Node last;
    public MyLinkedList() {
        count=0;
    }
    
    public int get(int index) {
        if(count<=index) return -1;
        Node curr=first;
        for(int i=1;i<=index;i++)
        {
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        first=new Node(val,first);
        if(count==0)
        {
            last=first;
        }
        count++;
    }
    
    public void addAtTail(int val) {
        if(count==0)
        {
            first=new Node(val);
            last=first;
            count++;
            return;
        }
        last.next=new Node(val);
        last=last.next;
        count++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>count) return;
        if(index==count)
        {
            addAtTail(val);
            return;
        }
        if(index==0)
        {
            addAtHead(val);
            return;
        }
        Node curr=first;
        for(int i=1;i<index;i++)
        {
            curr=curr.next;
        }
        curr.next=new Node(val,curr.next);
        count++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=count) return;
        if(index==0){
            if(count==1)
            {
                first=null;
                last=null;
                count=0;
                return;
            }
            first=first.next;
            count--;
            return;
        }
        Node curr=first;
        for(int i=1;i<index;i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        if(index==count-1) last=curr;
        count--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */