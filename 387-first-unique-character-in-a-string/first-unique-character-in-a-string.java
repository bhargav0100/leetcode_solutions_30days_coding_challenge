class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==1) return 0;
        Set<Character>set=new HashSet();
        for(int i=0;i<s.length()-1;i++)
        {
            int freq=0;
            if(set.isEmpty() || !set.contains(s.charAt(i)))
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        freq++;
                        break;
                    }
                }
                if(freq==0)
                {
                    return i;
                }
                set.add(s.charAt(i));
            }
        }
        if(!set.contains(s.charAt(s.length()-1)))
        {
            return s.length()-1;
        }
        return -1;
    }
}