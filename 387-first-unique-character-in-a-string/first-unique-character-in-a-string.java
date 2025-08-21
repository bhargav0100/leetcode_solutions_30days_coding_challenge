class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>m=new HashMap();
        for(char c:s.toCharArray())
        {
            if(m.containsKey(c))
            {
                int i=m.get(c);
                m.put(c,i+1);
            }
            else m.put(c,0);
        }
        for(int i=0;i<s.length();i++)
        {
            if(m.get(s.charAt(i))==0)
            {
                return i;
            }
        }
        return -1;
    }
}