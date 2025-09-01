class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]ans=new int[nums.length];
        int i=0;
        for(int n:nums)
        {
            ans[i++]=n;
        }
        Arrays.sort(ans);
        Map<Integer,Integer>m=new HashMap();
        int count=0;
        for(int n:ans)
        {
            if(!m.containsKey(n))
            {
                m.put(n,count);
            }
            count++;
        }
        i=0;
        for(int n:nums)
        {
            count=m.get(n);
            ans[i++]=count;
        }
        return ans;
    }
}