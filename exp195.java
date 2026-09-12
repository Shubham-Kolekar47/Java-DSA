public class exp194 {
    public static boolean isSafe(char board[][],int row,int col){//print only 1 solution of nQueens
        //vertically up
        for(int i=row-1; i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //digonal left up
        for(int i=row,j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char board[][],int row){
        //base case
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
        }

        //column rule
        for(int j =0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }//function call
                board[row][j] = '.';//backtracking step
            }
            
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("--------chess board--------");
        for(int i=0; i<board.length; i++){
            for(int j = 0;j<board.length;j++){
                System.out.println(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static int count = 0 ;
    public static void main(String args[]){
        int n = 4;
        char[][] board = new char[n][n];
        //initlize
        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        if(nQueens(board,0)){
            System.out.println("solution is possible");
            printBoard(board);
        }else{
            System.out.println("solution is not possible");
        }
        // System.out.println("total ways to solve n queens = " + count);
    } 
}
