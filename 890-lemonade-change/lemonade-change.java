class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                five++;
            }
            else if(bills[i]==10)
            {
                if(five==0)
                {
                    return false;
                }
                ten++;
                five--;
            }
            else
            {
                if((five==0 || ten==0) && five<3)
                {
                    return false;
                }
                if(ten==0)
                {
                    five-=3;
                    continue;
                }
                five--;
                ten--;
            }
        }
        return true;
    }
}