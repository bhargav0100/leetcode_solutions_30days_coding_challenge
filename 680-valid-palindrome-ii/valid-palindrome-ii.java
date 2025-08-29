class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        if(palindromeRemoveLeft(s,i,j))
        {
            return true;
        }
        else return palindromeRemoveRight(s,i,j);
    }
    private boolean palindromeRemoveLeft(String s,int i,int j)
    {
        int count=0;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                if(s.charAt(i+1)==s.charAt(j) && count!=1)
                {
                    count++;
                    i++;
                }
                else if(s.charAt(i)==s.charAt(j-1) && count!=1)
                {
                    count++;
                    j--;
                }
                else
                {
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean palindromeRemoveRight(String s,int i,int j)
    {
        int count=0;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                if(s.charAt(i)==s.charAt(j-1) && count!=1)
                {
                    count++;
                    j--;
                }
                else if(s.charAt(i+1)==s.charAt(j) && count!=1)
                {
                    count++;
                    i++;
                }
                else
                {
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
}