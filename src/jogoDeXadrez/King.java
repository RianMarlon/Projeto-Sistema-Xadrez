//Classe Rei

package jogoDeXadrez;

import jogoDeTabuleiro.Board;

public class King extends ChessPiece {

	//informando quem é o tabuleiro e a cor da peça
	public King(Board board, Color color) {
		super(board, color);
	}

	//Retornar letra referente a peça 
	@Override
	public String toString() {
		return " R";
	}

}
