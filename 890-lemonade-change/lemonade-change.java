class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change=new int[2];
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                change[0]++;
            }
            else if(bills[i]==10)
            {
                if(change[0]==0)
                {
                    return false;
                }
                change[1]++;
                change[0]--;
            }
            else
            {
                if((change[0]==0 || change[1]==0) && change[0]<=2)
                {
                    return false;
                }
                if(change[1]==0)
                {
                    change[0]-=3;
                    continue;
                }
                change[0]--;
                change[1]--;
            }
        }
        return true;
    }
}