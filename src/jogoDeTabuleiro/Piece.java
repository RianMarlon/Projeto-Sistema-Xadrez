//Classe peça

package jogoDeTabuleiro;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getTabuleiro() {
		return board;
	}

}
