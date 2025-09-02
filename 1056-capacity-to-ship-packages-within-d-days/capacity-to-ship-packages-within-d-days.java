class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int capacity=0;
        int sum=0;
        for(int weight:weights)
        {
            capacity=Math.max(capacity,weight);
            sum+=weight;
        }
        while(capacity<=sum)
        {
            int mid=(capacity+sum)/2;
            int temp=findDays(weights,mid);
            if(temp<=days)
            {
                sum=mid-1;
            }
            else
            {
                capacity=mid+1;
            }
        }
        return capacity;
    }
    public int findDays(int[] weights,int capacity)
    {
        int day=1;
        int sum=0;
        for(int weight:weights)
        {
            if(sum+weight>capacity)
            {
                sum=weight;
                day++;
            }
            else
            {
                sum+=weight;
            }
        }
        return day;
    }
}