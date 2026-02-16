class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                sum+=Math.pow(2,i+(32-s.length()));
            }
            
        }
        return sum;
    }
}