//Classe partida de Xadrez

package jogoDeXadrez;

import jogoDeTabuleiro.Board;
import jogoDeTabuleiro.Position;

public class ChessMatch {

	//Um tabuleiro para começar a partida
	private Board board;

	//A classe tem que saber a dimensão
	//do tabuleiro de xadrez
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	//Retornar uma matriz de peça de xadrez
	//corresponde a essa partida
	public ChessPiece[][] getPieces() {
		//Liberar as peças do tipo ChessPiece
		//com a quantida de linhas e colunas do tabuleiro
		ChessPiece mat[][] = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				//downcasting para ChessPiece
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	//Responsável por iniciar  a partida de Xadrez
	//Colocando as peças no tabuleiro
	private  void initialSetup () {
		board.placePiece(new Rook (board, Color.WHITE), new Position (2, 1));
		board.placePiece(new King (board, Color.BLACK), new Position (0, 4));
		board.placePiece(new King (board, Color.WHITE), new Position (7, 4));
	}

}
