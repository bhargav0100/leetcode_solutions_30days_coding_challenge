class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<=10) return new ArrayList();
        List<String>l=new ArrayList();
        Set<String>set=new HashSet();
        set.add(s.substring(0,10));
        for(int i=1;i<s.length()-9;i++)
        {
            String str=s.substring(i,i+10);
            if(set.contains(str))
            {
                if(!(l.contains(str)))
                {
                    l.add(str);
                }
            }
            else
            {
                set.add(str);
            }
        }
        return l;
    }
}