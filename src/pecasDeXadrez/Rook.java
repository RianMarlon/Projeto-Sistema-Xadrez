//Classe Torre

package pecasDeXadrez;

import jogoDeTabuleiro.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class Rook extends ChessPiece {

	//informando quem é o tabuleiro e a cor da peça
	public Rook(Board board, Color color) {
		super(board, color);
	}

	//Retornar letra referente a peça 
	@Override
	public String toString() {
		return " T";
	}	

}
