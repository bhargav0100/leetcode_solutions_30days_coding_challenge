class Node{
    int value;
    Node prev;
    Node next;
    public Node(int value)
    {
        this.value=value;
    }
    public Node(int value,Node next)
    {
        this(value);
        this.next=next;
    }
    public Node(Node prev,int value,Node next)
    {
        this(value,next);
        this.prev=prev;
    }
}
class MyCircularQueue {
    private Node first;
    private Node last;
    private int k;
    private int count;
    public MyCircularQueue(int k) {
        this.k=k;
    }
    
    public boolean enQueue(int value) {
        if(count>=k)
        {
            return false;
        }
        if(first==null)
        {
            first=new Node(value);
            last=first;
            count++;
            last.next=first;
            first.prev=last;
            return true;
        }
        last.next=new Node(last,value,first);
        last=last.next;
        first.prev=last;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
        {
            return false;
        }
        if(count==1)
        {
            first=null;
            last=null;
            count=0;
            return true;
        }
        first=first.next;
        first.prev=last;
        last.next=first;
        count--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
        {
            return -1;
        }
        return first.value;
    }
    
    public int Rear() {
        if(isEmpty())
        {
            return -1;
        }
        return last.value;
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */