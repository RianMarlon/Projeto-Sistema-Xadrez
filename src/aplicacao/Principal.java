package aplicacao;

import jogoDeTabuleiro.Board;
import xadrez.ChessMatch;

public class Principal {

	public static void main(String[] args) {

		Board board = new Board(8, 8);
		
		ChessMatch chessMatch =  new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
