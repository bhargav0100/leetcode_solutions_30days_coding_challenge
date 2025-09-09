class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>subsetList=new ArrayList();
        Arrays.sort(nums);
        backTracking(subsetList,new ArrayList(),nums,0);
        return subsetList;
    }
    public void backTracking(List<List<Integer>>subsetList,List<Integer>subset,int[] nums,int start)
    {
        if(subsetList.contains(subset)) return ;
        subsetList.add(new ArrayList(subset));
        for(int i=start;i<nums.length;i++)
        {
            subset.add(nums[i]);
            backTracking(subsetList,subset,nums,i+1);
            subset.remove(subset.size()-1);
        }
    }
}