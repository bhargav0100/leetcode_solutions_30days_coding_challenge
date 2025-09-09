class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>>permutations=new ArrayList();
         Arrays.sort(nums);
         backTracking(permutations,new ArrayList(),nums,new int[nums.length]);
         return permutations;
    }
    private void backTracking(List<List<Integer>>permutations,List<Integer>temp,int[] nums,int[]used)
    {
        if(temp.size()==nums.length && !permutations.contains(temp))
        {
            permutations.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]==1) continue;
            used[i]=1;
            temp.add(nums[i]);
            backTracking(permutations,temp,nums,used);
            used[i]=0;
            temp.remove(temp.size()-1);
        }
    }
}