class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        int [] arr=new int [l];
        for(int i=0;i<l;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        int s=0;
        int e=l-1;
        int i=l-1;
        while(s<=e)
        {
            if(nums[s]>nums[e])
            {
                arr[i--]=nums[s++];
            }
            else
            {
                arr[i--]=nums[e--];
            }
        }
        return arr;
    }
}