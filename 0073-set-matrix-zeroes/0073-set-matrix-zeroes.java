class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] m = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix[0].length;k++){
                        m[i][k]++;
                    }
                    for(int k=0;k<matrix.length;k++){
                        m[k][j]++;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(m[i][j]>=1)
                matrix[i][j] = 0;
            }
        }
    }
}