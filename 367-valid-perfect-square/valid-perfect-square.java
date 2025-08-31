class Solution {
    public boolean isPerfectSquare(int num) {
        long start=1;
        long end=num;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            long square=mid*mid;
            if(square==num)
            {
                return true;
            }
            else if(square>num)
            {
                end=mid-1;
            }
            else if(square<num)
            {
                start=mid+1;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}