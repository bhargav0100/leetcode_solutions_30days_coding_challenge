import java.util.Map.Entry;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList();
        Map<Integer,Integer>m=new HashMap();
        for(int n:nums)
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
        int length=nums.length/3;
        for(Entry<Integer,Integer>entry:m.entrySet())
        {
            if(entry.getValue()>length)
            {
                l.add(entry.getKey());
            }
        }
        return l;
    }
}