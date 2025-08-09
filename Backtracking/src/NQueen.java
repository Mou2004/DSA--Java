public class NQueen {
    //classic n queen problem

    public static void nQueens(char board[][], int row){
        if (row==board.length){
            printBoard(board);
            return;
        }
        for (int j=0;j<board.length;j++){
            if (isSafe(board, row,j))
            board[row][j]='Q';
            nQueens(board,row+1);//recursion step
            board[row][j]='.';//backtracking step
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        //col check
        for (int i = row-1;i>=0;i-- ){
            if (board[i][col]=='Q'){
                return false;
            }
        }

        //row check
        for (int j = col-1;j>=0;j--){
            if (board[row][j]=='Q'){
                return false;
            }
        }

        //diagonal check
        for (int i = row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }


    public static void printBoard(char board[][]){
        for (int i =0;i<board.length;i++){
            for (int j=0;j< board[i].length;j++){
                System.out.print(board[i][j]+"");

            }
            System.out.println();


        }
        System.out.println("----");
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        //initiatlize board
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]= '.';
            }
        }
        nQueens(board,0);
    }
}
