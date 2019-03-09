//Classes peças de Xadrez que
//extende a classe peça

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
	
	//posição da peça
	public ChessPosition getChessPosition () {
		return ChessPosition.fromPosition(position);
	}

	// Verificar se não existe uma peça adversária nessa posição
	// Testando a cor das peças
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}