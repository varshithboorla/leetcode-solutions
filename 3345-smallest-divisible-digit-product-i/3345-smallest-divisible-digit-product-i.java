class Solution {
    public int smallestNumber(int n, int t) {
        int i=0;
        while(i<10){
            int prod = 1;
            int j = n;
            while(j>0){
                int k = j%10;
                prod *= k;
                j=j/10;
            } 
            if(prod%t==0) return n;
            i++;    
            n++;     
        }
        return n;
    }
}