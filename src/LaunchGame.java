
public class LaunchGame {

	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		HumanPlayer p1 = new HumanPlayer("Viru", 'X');
		// HumanPlayer p2 = new HumanPlayer("Kunal", 'O');
		AIPlayer p2 = new AIPlayer("VAI", 'O');
		Player cp;
		cp = p1;

		while (true) {

			System.out.println(cp.name + " Turn");
			cp.makeMove();

			TicTacToe.displayboard();

			if (TicTacToe.checkColWin() || TicTacToe.checkDiagWin() || TicTacToe.checkRowWin()) {

				System.out.println(cp.name + " has won");
				break;

			} else if (TicTacToe.checkdraw()) {
				System.out.println("Game is Draw");
				break;
			}

			else {
				if (cp == p1) {

					cp = p2;
				} else {

					cp = p1;
				}
			}

		}

	}

}
