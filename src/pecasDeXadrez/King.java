//Classe Rei

package pecasDeXadrez;

import jogoDeTabuleiro.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class King extends ChessPiece {

	//informando quem � o tabuleiro e a cor da pe�a
	public King(Board board, Color color) {
		super(board, color);
	}

	//Retornar letra referente a pe�a 
	@Override
	public String toString() {
		return "R";
	}

}
