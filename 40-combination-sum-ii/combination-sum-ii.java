class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>combination=new ArrayList();
        Arrays.sort(candidates);
        backTracking(combination,new ArrayList(),target,candidates,0);
        return combination;
    }
    private void backTracking(List<List<Integer>>combination,List<Integer>sum,int target,int[] candidates,int start)
    {
        if(target==0)
        {
            combination.add(new ArrayList(sum));
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            if(candidates[i]>target)
            {
                break;
            }
            if(i>start && candidates[i-1]==candidates[i])
            {
                continue;
            }
            sum.add(candidates[i]);
            backTracking(combination,sum,target-candidates[i],candidates,i+1);
            sum.remove(sum.size()-1);
        }
    }
}