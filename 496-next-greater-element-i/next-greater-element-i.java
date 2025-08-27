class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer>m=new HashMap();
        int index=0;
        for(int n:nums2)
        {
            m.put(n,index++);
        }
        int []ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int j=m.get(nums1[i]);
            if(j==nums2.length-1)
            {
                ans[i]=-1;
            }
            else
            {
                for(j=j+1;j<nums2.length;j++)
                {
                    if(nums2[j]>nums1[i])
                    {
                        ans[i]=nums2[j];
                        break;
                    }
                    if(j==nums2.length-1)
                    {
                        ans[i]=-1;
                    }
                }
            }
        }
        return ans;
    }
}