class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<=10) return new ArrayList();
        List<String>l=new ArrayList();
        Set<String>set=new HashSet();
        set.add(s.substring(0,10));
        for(int i=1;i<s.length()-9;i++)
        {
            if(set.contains(s.substring(i,i+10)))
            {
                if(!(l.contains(s.substring(i,i+10))))
                {
                    l.add(s.substring(i,i+10));
                }
            }
            else
            {
                set.add(s.substring(i,i+10));
            }
        }
        return l;
    }
}