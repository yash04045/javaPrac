public class Sudoku {

    public static boolean isSafe(int[][] board, int row, int col,int digit){
        //column
        for(int i = 0; i <= 8; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        //row
        for(int j = 0; j <= 8; j++){
            if(board[row][j] == digit){
                return false;
            }
        }

        //Gird
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int[][] board, int row, int col){
        //base case
        if(row == 9 ){
            return true;
        }
        //Recursion
        int nextRow = row, nextCol = col + 1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(board[row][col] != 0){
            return sudokuSolver(board,nextRow,nextCol);
        }

        for(int digit = 1; digit <= 9; digit++ ){
            if(isSafe(board, row,col,digit)){
                board[row][col] = digit;
                if(sudokuSolver(board,nextRow,nextCol)){
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int board[][]){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(sudokuSolver(board,0,0)){
            System.out.println("Solution Exist");
            printSudoku(board);
        }else{
            System.out.println("Solution does not exist");
        }
    }
}
