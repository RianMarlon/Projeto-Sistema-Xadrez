//Classe partida de Xadrez

package xadrez;

import jogoDeTabuleiro.Board;
import jogoDeTabuleiro.Piece;
import jogoDeTabuleiro.Position;
import pecasDeXadrez.King;
import pecasDeXadrez.Rook;

public class ChessMatch {

	//Um tabuleiro para começar a partida
	private Board board;

	//A classe tem que saber a dimensão
	//do tabuleiro de xadrez
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	//Retornar uma matrix de peça de xadrez
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
	
	public ChessPiece performChessMove (ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target  = targetPosition.toPosition();
		validateSourcePosition(source);
		Piece capturedPiece = makeMove (source, target);
		return (ChessPiece) capturedPiece;
	}
	//Recebe uma posição de origem e uma posição de destino
	private Piece makeMove (Position source, Position target) {
		Piece p = board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(p, target);
		return capturedPiece;
	}
	
	private void validateSourcePosition (Position position) {
		if (!board.thereIsAPiece(position)) {
			throw new ChessException ("Nao existe peca na posicao de origem.");
		}
	}
	
	private void placeNewPiece (char column, int row, ChessPiece piece) {
		//Passa a peça e instanciar uma ChessPosition com os dados
		//Convertendo para a posição de matrix
		board.placePiece(piece, new ChessPosition (column, row).toPosition());
	}
	
	//Responsável por iniciar  a partida de Xadrez
	//Colocando as peças no tabuleiro
	private  void initialSetup () {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}

}
