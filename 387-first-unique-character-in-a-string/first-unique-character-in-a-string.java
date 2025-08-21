class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>m=new HashMap();
        char[]ch=s.toCharArray();
        for(char c:ch)
        {
            if(!m.isEmpty() && m.containsKey(c))
            {
                int i=m.get(c);
                m.put(c,i+1);
            }
            else
            {
                m.put(c,0);
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            if(m.containsKey(ch[i]))
            {
                if(m.get(ch[i])==0)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}