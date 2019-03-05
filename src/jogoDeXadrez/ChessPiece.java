//Classes pe�as de Xadres que
//extende a classe pe�a

package jogoDeXadrez;

import jogoDeTabuleiro.Board;
import jogoDeTabuleiro.Piece;

public class ChessPiece extends Piece {

	private Color color;
	// contagem de movimentos
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
