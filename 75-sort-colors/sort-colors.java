class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer>m=new HashMap();
        m.put(0,0);
        m.put(1,0);
        m.put(2,0);
        for(int n:nums)
        {
            if(m.containsKey(n))
            {
                int i=m.get(n);
                m.put(n,i+1);
            }
        }
        int i=0;
        int k=0;
        while(i<3)
        {
            for(int j=0;j<m.get(i);j++)
            {
                nums[k++]=i;
            }
            i++;
        }
    }
}