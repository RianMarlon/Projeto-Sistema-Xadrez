//Classe Torre

package pecasDeXadrez;

import jogoDeTabuleiro.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class Rook extends ChessPiece {

	// informando quem � o tabuleiro e a cor da pe�a
	public Rook(Board board, Color color) {
		super(board, color);
	}

	// Retornar letra referente a pe�a
	@Override
	public String toString() {
		return "T";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
