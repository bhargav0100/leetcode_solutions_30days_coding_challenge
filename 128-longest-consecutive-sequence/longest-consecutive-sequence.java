class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1) return 0;
        Arrays.sort(nums);
        int res=1;
        int count=1;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(sum+1!=nums[i] && sum!=nums[i])
            {
                sum=nums[i];
                res=Math.max(res,count);
                count=1;
            }
            else if(sum+1==nums[i])
            {
                sum=nums[i];
                count++;
            }
        }
        return Math.max(res,count);
    }
}