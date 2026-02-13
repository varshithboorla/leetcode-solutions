class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num =0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){num=nums[i];map.get(nums[i]++);}
            else map.put(nums[i],0);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)) return new int[] {num,i};
        }
        return new int[] {num,0};
    }
}