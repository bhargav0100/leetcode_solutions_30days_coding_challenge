class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return new ArrayList();
        Arrays.sort(nums);
        if(nums[nums.length-1]<0) return new ArrayList();
        Set<List<Integer>>s=new HashSet();
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0)
                {
                    k--;
                    continue;
                }
                else if(sum<0)
                {
                    j++;
                    if(nums[i]+nums[j]>0) break;
                    continue;
                }
                else
                {
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1]) j++;
                while(j<k && nums[k]==nums[k+1]) k--;
            }
        }
        return new ArrayList(s);
    }
}