package nucci;

import java.util.Scanner;

public class TicTacToe {

	public static int[] coords = new int[2];

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		char currentPlayer = 'O';

		int xSize = 3;
		int ySize = 3;
		char[][] board = new char[xSize][ySize];

		String userInput = "";

		for (int i = 0; i < (xSize * ySize); i++) {
			if (i % 2 == 0) {
				currentPlayer = 'O';
				System.out.println("Player 1 enter your coordinants (x,y)");
			} else {
				currentPlayer = 'X';
				System.out.println("Player 2 enter your coordinants (x,y)");
			}

			userInput = read.nextLine();
			splitInput(userInput);
			board[coords[0] - 1][coords[1] - 1] = currentPlayer;

			makeSquare(board);
		}

	}

	public static void makeSquare(char[][] ID) {
		System.out.println("______________________________");
		System.out.println("|         |         |         |");
		System.out.println("|    " + ID[0][0] + "    |    " + ID[0][1] + "    |    " + ID[0][2] + "    |");
		System.out.println("|_________|_________|_________|");
		System.out.println("|         |         |         |");
		System.out.println("|    " + ID[1][0] + "    |    " + ID[1][1] + "    |    " + ID[1][2] + "    |");
		System.out.println("|_________|_________|_________|");
		System.out.println("|         |         |         |");
		System.out.println("|    " + ID[2][0] + "    |    " + ID[2][1] + "    |    " + ID[2][2] + "    |");
		System.out.println("|_________|_________|_________|");

	}
	public static void splitInput(String input) {
		char[] splitInput = input.toCharArray();

		coords[0] = splitInput[0] - 48;
		coords[1] = splitInput[2] - 48;
	}
}
