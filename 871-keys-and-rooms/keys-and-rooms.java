class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] keys=new int[rooms.size()];
        visited(rooms,0,keys);
        for(int k:keys)
        {
            if(k==0) return false;
        }
        return true;
    }
    private void visited(List<List<Integer>> rooms,int key,int[] keys)
    {
        keys[key]=1;
        for(Integer k:rooms.get(key))
        {
            if(keys[k]==0) visited(rooms,k,keys);
        }
    }
}