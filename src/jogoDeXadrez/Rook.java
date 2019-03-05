//Classe Torre

package jogoDeXadrez;

import jogoDeTabuleiro.Board;

public class Rook extends ChessPiece {

	//informando quem � o tabuleiro e a cor da pe�a
	public Rook(Board board, Color color) {
		super(board, color);
	}

	//Retornar letra referente a pe�a 
	@Override
	public String toString() {
		return " T";
	}	

}
