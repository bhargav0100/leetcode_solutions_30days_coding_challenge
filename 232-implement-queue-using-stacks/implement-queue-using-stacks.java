class MyQueue {
    Stack<Integer> temp=new Stack();
    Stack<Integer> s=new Stack();
    int count;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(s.isEmpty())
        {
            s.push(x);
            count++;
        }
        else
        {
            while(!s.isEmpty())
            {
                temp.push(s.pop());
            }
            temp.push(x);
            while(!temp.isEmpty())
            {
                s.push(temp.pop());
            }
            count++;
        }
    }
    
    public int pop() {
        count--;
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return count==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */