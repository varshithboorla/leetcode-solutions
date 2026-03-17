class Solution {
    public String thousandSeparator(int n) {
        if(n<1000) return Integer.toString(n);
        String num = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=num.length()-1;i>=0;i--){
            if(count==3){
                sb.append(".");
                count=0;
            }
            sb.append(num.charAt(i));
            count++;
        }
        sb.reverse();
        return sb.toString();
    }
}