class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>>subsetList=new HashSet();
        Arrays.sort(nums);
        backTracking(subsetList,new ArrayList(),nums,0);
        return new ArrayList(subsetList);
    }
    public void backTracking(Set<List<Integer>>subsetList,List<Integer>subset,int[] nums,int start)
    {
        subsetList.add(subset);
        for(int i=start;i<nums.length;i++)
        {
            subset.add(nums[i]);
            backTracking(subsetList,new ArrayList(subset),nums,i+1);
            subset.remove(subset.size()-1);
        }
    }
}