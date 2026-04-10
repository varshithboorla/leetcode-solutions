class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i=0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int k=0;k<students.length;k++) list.add(students[k]);
        while(i<list.size()){
            if(list.get(i)==sandwiches[j]){
                j++;
                list.remove(i);
                i=0;
            }else{
                i++;
            }
        }
        return list.size();
    }
}