class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }

    boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char c = board[i][j];
                    if(!isValid(board,i,j,c)){
                        return false;
                    }
                }
                
            }
        }
        return true;
    }

    boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i]==c&&i!=col){
                return false;
            }

            if(board[i][col]==c&&i!=row){
                return false;
            }

            int r = 3*(row/3)+i/3;
            int cl = 3*(col/3)+i%3;

            if(board[r][cl]==c&&(r!=row||cl!=col)){
                return false;
            }
        }
        return true;
    }
}