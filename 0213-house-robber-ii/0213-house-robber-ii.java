class Solution {
    public int houserobber(int[] arr){
        if(arr.length==2) return Math.max(arr[0],arr[1]);
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[dp.length-1];
    }
    public int rob(int[] nums) {
       if(nums.length==1) return nums[0];
       else if(nums.length==2) return Math.max(nums[0],nums[1]);
       else{
        int[] splast = new int[nums.length-1];
        int[] spfirst = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            splast[i] = nums[i];
            spfirst[i] = nums[i+1];
        }
        int llast = houserobber(splast);
        int lfirst = houserobber(spfirst);
        return Math.max(llast,lfirst);
       } 
    }
}