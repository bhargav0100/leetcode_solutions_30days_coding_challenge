class NumArray {
    private int[]arr;
    public NumArray(int[] nums) {
        arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                arr[0]=nums[0];
            }
            else
            {
                arr[i]=arr[i-1]+nums[i];
            }
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return arr[right];
        return arr[right]-arr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */