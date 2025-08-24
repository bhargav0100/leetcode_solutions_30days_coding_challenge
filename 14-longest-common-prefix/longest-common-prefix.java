class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        if(res.length()<1) return "";
        for(int i=1;i<strs.length;i++)
        {
            if(strs[i].length()>0)
            {
                int j=0;
                while(j<res.length() && j<strs[i].length())
                {
                    if(res.charAt(j)==strs[i].charAt(j))
                    {
                        j++;
                    }
                    else
                    {
                        break;
                    }
                }
                res=res.substring(0,j);
            }
            else
            {
                return "";
            }
            if(res.length()<1)
            {
                return res;
            }
        }
        return res;
    }
}