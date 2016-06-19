package june_3;

import java.util.Scanner;

public class KnigthTour1 {

	private Scanner input = new Scanner(System.in);
	static int rows = 8, cols = 8;
	private static int[][] board = new int[rows][cols];
	//private static boolean[][] visited = new boolean[5][5];
	private static int topRow = 0;
	private static int botRow = 7;
	private int leftCol = 0;
	private static int rightCol = 7;
	private int count = 0, totalCount = 0;

	public static void display() {
		String oneSpace = " ", twoSpace = "  ";
		for (int i = 0; i <= botRow; i++) {
			for (int j = 0; j <= rightCol; j++) {
				if (board[i][j] < 10) {
					System.out.print(board[i][j] + twoSpace);
					System.out.print("    ");
				} else if (board[i][j] < 99) {
					System.out.print(board[i][j] + oneSpace);
					System.out.print("    ");
				} else {
					System.out.print(board[i][j]);
					System.out.print("    ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

	private void clearBoardAndVisit() {

		for (int i = 0; i < botRow; i++) {
			for (int j = 0; j < rightCol; j++) {
				board[i][j] = 0;
				count = 0;
			}
		}
	}

	/*public void tourGenerator() {
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				tour(i, j);*/
				/*
				 * display(); System.out.println(totalCount + " move");
				 * System.out.println(); clearBoardAndVisit();
				 
			}

		}
	}*/

	public void tour(int row, int col) {
		 count++;
		// totalCount++;
		//int move = input.nextInt();
		// display();
		// System.out.println("move =" + (totalCount));

		/*
		  System.out.println("count = " + count); if (board[row][col] !=0) {
		 * count--; } else
		 */{
			// visited[row][col] = true;
			board[row][col] = count;
			if (count == rows * cols) {
				System.out.println("Solution" + (totalCount));
				 totalCount++;
				display();
			}
			// 1
			if (col < rightCol - 1 && row < botRow && board[row+1][col+2] == 0) {// go
																		// one
				// down;
				// System.out.println("if # 1");
				//count++;
				tour(row + 1, col + 2);
			}// 2
			if (row < botRow - 1 && col < rightCol && board[row+2][col+1] == 0) {// go
																// one
				// to the rigth
				// System.out.println("if # 2");
				//count++;
				tour(row + 2, col + 1);
			}// 3
			if (row < botRow - 1 && col > leftCol && board[row+2][col-1] == 0) {// go
														// and
																			// one
				// to the left
				// System.out.println("if # 3");
				//count++;
				tour(row + 2, col - 1);
			}// 4
			if (col > leftCol + 1 && row < botRow && board[row+1][col-2] == 0) {// go
														// one
				// System.out.println("if # 4");
				//count++;
				tour(row + 1, col - 2);
			}// 5
			if (col > leftCol + 1 && row > topRow && board[row-1][col-2] == 0) {// go
													// one
				// up
				// System.out.println("if # 5");
				//count++;
				tour(row - 1, col - 2);
			}// 6
			if (row > topRow + 1 && col > leftCol && board[row-2][col-1] == 0) {// go
															// to
				// the left
				// System.out.println("if # 6");
				//count++;
				// the left
				tour(row - 2, col - 1);
			}// 7
			if (row > topRow + 1 && col < rightCol && board[row-2][col+1] == 0) {// go
																				// up
														// to
				// the right
				// System.out.println("if # 7");
				//count++;
				tour(row - 2, col + 1);
			}// 8
			if (col < rightCol - 1 && row > topRow && board[row-1][col+2] == 0) {// go
														// one
				// System.out.println("if # 8"); // up
				//count++;
				tour(row - 1, col + 2);
			}
			board[row][col] = 0;
			count--;
			// visited[row][col] = false;
		}

	}

	public static void main(String[] arg) {
		/* setBoard(); */
		// display();
		// System.out.println("board " + board[2][2]);
		KnigthTour1 test = new KnigthTour1();
		/* test.display(); */
		test.tour(0,0);

	}

}




