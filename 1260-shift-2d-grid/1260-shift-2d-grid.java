class Solution {
    public static List<List<Integer>> print(int[][] grid){
        List<List<Integer>>  list = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                l.add(grid[i][j]);
            }
            list.add(l);
        }
        return list;
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;
        int n = r * c;
        k = k % n;
        if(k==0) return print(grid);
        for(int i=k;i>0;i--){
            int[][] arr = new int[grid.length][grid[0].length];
            for(int j=0;j<grid.length;j++){
                for(int m=0;m<grid[0].length-1;m++){
                    arr[j][m+1] = grid[j][m];
                }
            }
            arr[0][0] = grid[r-1][c-1];
            for(int j=1;j<r;j++){
                arr[j][0] = grid[j-1][c-1];
            }
            System.out.print(arr[0][0]+" ");
            grid = arr;
        }
        return print(grid);        
    }
}