//Classes pe�as de Xadrez que
//extende a classe pe�a

package xadrez;

import jogoDeTabuleiro.Board;
import jogoDeTabuleiro.Piece;
import jogoDeTabuleiro.Position;

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
	
	public int getMoveCount () {
		return moveCount;
	}
	
	public void increaseMoveCount () {
		moveCount ++;
	}
	
	public void decreaseMoveCount () {
		moveCount --;
	}
	
	//posi��o da pe�a
	public ChessPosition getChessPosition () {
		return ChessPosition.fromPosition(position);
	}

	// Verificar se n�o existe uma pe�a advers�ria nessa posi��o
	// Testando a cor das pe�as
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}