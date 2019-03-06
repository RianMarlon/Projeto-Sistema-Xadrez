//Classes peças de Xadres que
//extende a classe peça

package xadrez;

import jogoDeTabuleiro.Board;
import jogoDeTabuleiro.Piece;

public abstract class ChessPiece extends Piece {

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
