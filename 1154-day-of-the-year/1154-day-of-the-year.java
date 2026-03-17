class Solution {
    public int dayOfYear(String date) {
        int arr[] = {31,59,90,120,151,181,212,243,273,304,334,365};
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        if(month==1) return day;
        if(year%400==0||(year%4==0&&year%100!=0)){
            if(month>2){
                return arr[month-2]+1+day;
            }else{
                return arr[month-2]+day;
            }
        }
        if(month>1) return arr[month-2]+day;
        return day;
    }
}