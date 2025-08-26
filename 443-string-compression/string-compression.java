class Solution {
    public int compress(char[] chars) {
        if(chars.length<2) return chars.length;
        String str="";
        char c=chars[0];
        int count=1;
        for(int i=1;i<chars.length;i++)
        {
            if(c==chars[i])
            {
                count++;
                if(i==chars.length-1)
                {
                    str+=c;
                    String s=String.valueOf(count);
                    str+=s;
                }
            }
            else if(i==chars.length-1)
            {
                str+=c;
                if(count!=1)
                {
                    String s=String.valueOf(count);
                    str+=s;
                }
                if(c!=chars[i])
                {
                    str+=chars[i];
                }
            }
            else
            {
                if(count==1)
                {
                    str+=c;
                    c=chars[i];
                }
                else
                {
                    str+=c;
                    c=chars[i];
                    String s=String.valueOf(count);
                    str+=s;
                    count=1;
                }
            }
        }
        for(int i=0;i<str.length();i++)
        {
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}