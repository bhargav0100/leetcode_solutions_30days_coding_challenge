class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(p1,p2)->p1[0]==p2[0]?p1[1]-p2[1]:p2[0]-p1[0]);
        List<int[]>l=new ArrayList();
        for(int[] p:people)
        {
            l.add(p[1],p);
        }
        return l.toArray(new int[people.length][2]);
    }
}