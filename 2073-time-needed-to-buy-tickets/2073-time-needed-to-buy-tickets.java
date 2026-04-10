class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0;
        int count=0;
        int n = tickets.length;
        while(true){
            i = i % n;
            
            if(tickets[i]>0){
                tickets[i]--;
                count++;
            }
            if(i==k&&tickets[k]==0) break;
            i++;
        }
        return count;
    }
}