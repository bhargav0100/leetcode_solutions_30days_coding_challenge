class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        Set<Integer>s=new HashSet();
        while(true)
        {
            s.add(n);
            int num=0;
            while(n>0)
            {
                int rem=n%10;
                num+=rem*rem;
                n/=10;
            }
            n=num;
            if(n==1)
            {
                return true;
            }
            else if(s.contains(n))
            {
                return false;
            }
        }
    }
}