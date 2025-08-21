class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<2) return false;
        Set<Integer>s=new HashSet();
        s.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(s.contains(nums[i]))
            {
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
}