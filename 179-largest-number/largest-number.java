class Solution {
    public String largestNumber(int[] nums) {
        String []str=new String [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,new Comparator<String>(){
            public int compare(String s1,String s2)
            {
                return (s2+s1).compareTo(s1+s2);
            }
        });
        if(str[0].equals("0")) return "0";
        String res="";
        for(String s:str)
        {
            res+=s;
        }
        return res;
    }
}