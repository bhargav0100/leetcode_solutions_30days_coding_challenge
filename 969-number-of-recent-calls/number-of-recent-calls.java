class RecentCounter {
    Queue<Integer> q=new ArrayDeque();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        int time=t-3000;
        q.add(t);
        while(time>q.peek())
        {
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */