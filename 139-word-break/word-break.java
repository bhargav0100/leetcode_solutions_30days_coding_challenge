class Solution {
    private Boolean[] mark;
    public boolean wordBreak(String s, List<String> wordDict) {
        mark=new Boolean[s.length()];
        return result(s,0,wordDict);
    }
    private boolean result(String s,int index,List<String> wordDict)
    {
        if(index==s.length()) return true;
        if(mark[index]!=null) return mark[index];
        for(int i=index+1;i<=s.length();i++)
        {
            if(wordDict.contains(s.substring(index,i)) && result(s,i,wordDict))
            {
                return mark[index]=true;
            }
        }
        return mark[index]=false;
    }
}