class Solution {
    public int[] countBits(int n) {
        int count=0;
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            count=0;
            int k=i;
            while(k>0){
                k = k&(k-1);
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}