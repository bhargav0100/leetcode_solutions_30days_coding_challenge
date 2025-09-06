class MedianFinder {
    private PriorityQueue<Integer>pleft=new PriorityQueue(new Comparator<Integer>(){
        public int compare(Integer a,Integer b){
            return b-a;
        }
    });
    private PriorityQueue<Integer>pright=new PriorityQueue();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(pleft.isEmpty() || num<pleft.peek())
        {
            pleft.add(num);
        }
        else
        {
            pright.add(num);
        }
        if(pleft.size()-pright.size()>1)
        {
            pright.add(pleft.poll());
        }
        else if(pright.size()>pleft.size())
        {
            pleft.add(pright.poll());
        }
    }
    
    public double findMedian() {
        if(pleft.size()==pright.size())
        {
            double mid=pleft.peek()+pright.peek();
            return mid/2;
        }
        return pleft.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */