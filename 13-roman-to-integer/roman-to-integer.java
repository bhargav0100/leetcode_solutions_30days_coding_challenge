class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>m=new HashMap();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            if(i>0 && (s.charAt(i)=='X' || s.charAt(i)=='V') && s.charAt(i-1)=='I')
            {
                num+=m.get(s.charAt(i))-2;
            }
            else if(i>0 && (s.charAt(i)=='L' || s.charAt(i)=='C') && s.charAt(i-1)=='X')
            {
                num+=m.get(s.charAt(i))-20;
            }
            else if(i>0 && (s.charAt(i)=='D'||s.charAt(i)=='M') && s.charAt(i-1)=='C')
            {
                num+=m.get(s.charAt(i))-200;
            }
            else
            {
                num+=m.get(s.charAt(i));
            }
        }
        return num;
    }
}