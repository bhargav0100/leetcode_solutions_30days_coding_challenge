class Solution {
    public int[] runningSum(int[] nums) {
        int [] prefixSum=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                prefixSum[i]=nums[i];
            }
            else
            {
                prefixSum[i]=prefixSum[i-1]+nums[i];
            }
        }
        return prefixSum;
    }
}