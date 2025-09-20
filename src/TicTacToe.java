import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] board = new char[3][3];

        // Initialize board with spaces
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scan = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter row and column (0-2):");

            int i = scan.nextInt();
            int j = scan.nextInt();

            if (i >= 0 && i < 3 && j >= 0 && j < 3 && board[i][j] == ' ') {
                board[i][j] = player;
                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("Player " + player + " wins!");
                } else {
                    player = (player == 'X') ? 'O' : 'X'; // switch players
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        printBoard(board);

    }

    public static boolean haveWon(char[][] board, char player) {
        // check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }
        // check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player)
                return true;
        }
        // check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
