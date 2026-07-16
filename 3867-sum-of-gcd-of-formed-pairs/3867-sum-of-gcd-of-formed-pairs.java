class Solution {
    public int g(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int mx = 0;
        int[] pre = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            pre[i] = mx;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = g(pre[i],nums[i]);
        }
        Arrays.sort(nums);
        long sum = 0;
        for(int i=0;i<nums.length/2;i++){
            sum+=g(nums[i],nums[nums.length-1-i]);
        }      
        return sum;  
    }
}