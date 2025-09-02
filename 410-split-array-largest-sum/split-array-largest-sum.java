class Solution {
    public int splitArray(int[] nums, int k) {
        int max=Arrays.stream(nums).max().getAsInt();
        int sum=Arrays.stream(nums).sum();
        while(max<=sum)
        {
            int mid=(max+sum)/2;
            int min=subArray(nums,mid);
            if(min>k)
            {
                max=mid+1;
            }
            else
            {
                sum=mid-1;
            }
        }
        return max;
    }
    private int subArray(int[]nums,int max)
    {
        int sum=0;
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if(sum+nums[i]<=max)
            {
                sum+=nums[i];
            }
            else
            {
                sum=nums[i];
                count++;
            }
        }
        return count;
    }
}