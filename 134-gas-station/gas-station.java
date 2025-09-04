class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index=-1;
        int totalgas=0;
        int totalcost=0;
        int rem=0;
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
            rem+=gas[i]-cost[i];
            if(rem<0)
            {
                rem=0;
                index=-1;
            }
            else if(index==-1)
            {
                index=i;
            }
        }
        if(totalgas<totalcost) return -1;
        return index;
    }
}