//Classe Rei

package jogoDeXadrez;

import jogoDeTabuleiro.Board;

public class King extends ChessPiece {

	//informando quem � o tabuleiro e a cor da pe�a
	public King(Board board, Color color) {
		super(board, color);
	}

	//Retornar letra referente a pe�a 
	@Override
	public String toString() {
		return " R";
	}

}
