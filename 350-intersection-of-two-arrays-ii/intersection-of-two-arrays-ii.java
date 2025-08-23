class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>m=new HashMap();
        int []res=new int [nums1.length];
        for(int n:nums1)
        {
            if(m.containsKey(n))
            {
                int i=m.get(n);
                m.put(n,++i);
            }
            else
            {
                m.put(n,1);
            }
        }
        int count=0;
        for(int n:nums2)
        {
            if(m.containsKey(n))
            {
                int i=m.get(n);
                if(i>0)
                {
                    res[count++]=n;
                }
                m.put(n,--i);
            }
        }
        return Arrays.copyOfRange(res,0,count);
    }
}