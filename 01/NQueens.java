import java.util.Scanner;

public class NQueens {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = input.nextInt();

		char[][] board = new char[n][n];
		for(int r=0; i<board.length; i++) {
			for(int c=0; j<board.length; j++) {
				board[r][c] = '-';
			}
		}

		solveQueens(board, 0);
	}
	private static char[][] solveQueens(char[][] board; int row) {
		if(board.length == n) return board;
	}
}
