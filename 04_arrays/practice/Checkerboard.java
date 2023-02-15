public class Checkerboard {
    public static void main(String[] args) {
        char[][] board = new char[5][5];
        
        for (int row=0; row<board.length; ++row) {
            for (int col=0; col<board[row].length; ++col) {
                if (row==0 || col==0) {
                    board[row][col] = 'O';
                } else {
                    board[row][col] = 'X';
                }
                System.out.print(" " + board[row][col] + " ");
            }
            System.out.println();
        }

    }
}