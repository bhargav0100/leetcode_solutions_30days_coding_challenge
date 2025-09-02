class Solution {
    public int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;
        for(int num : nums){
            max=Math.max(max,num);
            sum+=num;
        }
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
            if(sum+nums[i]>max)
            {
                sum=nums[i];
                count++;
            }
            else
            {
                sum+=nums[i];
            }
        }
        return count;
    }
}