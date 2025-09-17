class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap();
        map.put(0,1);
        for(int num: nums)
        {
            Map<Integer,Integer> tempMap=new HashMap();
            for(int sum: map.keySet())
            {
                int count=map.get(sum);
                tempMap.put(sum+num,tempMap.getOrDefault(sum+num,0)+count);
                tempMap.put(sum-num,tempMap.getOrDefault(sum-num,0)+count);
            }
            map=tempMap;
        }
        return map.getOrDefault(target,0);
    }
}