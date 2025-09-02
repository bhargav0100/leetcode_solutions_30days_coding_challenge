class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int capacity=0;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            capacity=Math.max(capacity,weights[i]);
            sum+=weights[i];
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
        for(int i=0;i<weights.length;i++)
        {
            if(sum+weights[i]>capacity)
            {
                sum=weights[i];
                day++;
            }
            else
            {
                sum+=weights[i];
            }
        }
        return day;
    }
}