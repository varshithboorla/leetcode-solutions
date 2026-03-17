class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean arr[]  = new boolean[128];
        int count = 0;
        for(int i=0;i<jewels.length();i++) arr[jewels.charAt(i)] = true;
        for(int i=0;i<stones.length();i++) if(arr[stones.charAt(i)]==true) count++;     
        return count;
    }
}