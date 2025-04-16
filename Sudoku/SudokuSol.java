class SudokuSol {
    public boolean isSafe(char[][] board ,int row ,int col , int number){
        for(int i=0; i<board.length;i++){
            if(board[i][col]==(char)(number + '0')) return false;
            if(board[row][i]==(char)(number + '0')) return false;
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr; i<sr+3 ;i++){
            for(int j=sc; j<sc+3 ;j++){
                if(board[i][j]==(char)(number + '0')) return false;
            }
        }
        return true;
    }

    public boolean helper(char[][] board ,int row ,int col){
        if(row==board.length){
            return true;
        }

        int nrow, ncol;
        if(col !=board.length-1){
            nrow=row;
            ncol=col+1;
        } else {
            nrow=row+1;
            ncol=0;
        }

        if(board[row][col]!= '.'){
            return helper(board,nrow,ncol);
        } else {
            for(int i=1;i<=9 ;i++){
                if(isSafe(board ,row ,col ,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board ,nrow ,ncol)) return true;
                    else board[row][col]='.';
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board){
        helper(board ,0 ,0);
    }

    // Add this main method to test
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        SudokuSol solver = new SudokuSol();
        solver.solveSudoku(board);

        // Print solved Sudoku
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
5 3 4 6 7 8 9 1 2 
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4 
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9

*/