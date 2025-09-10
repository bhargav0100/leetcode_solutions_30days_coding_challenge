class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>>permutations=new ArrayList();
         Arrays.sort(nums);
         backTracking(permutations,nums,0,new HashSet());
         return permutations;
    }
    private void backTracking(List<List<Integer>>permutations,int[] nums,int start,Set<Integer>set)
    {
        if(start==nums.length-1)
        {
            permutations.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }
        for(int i=start;i<nums.length;i++)
        {
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(nums,start,i);
            backTracking(permutations,nums,start+1,new HashSet());
            swap(nums,start,i);
        }
    }
    private void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}