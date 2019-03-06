//Classe partida de Xadrez

package xadrez;

import jogoDeTabuleiro.Board;
import jogoDeTabuleiro.Piece;
import jogoDeTabuleiro.Position;
import pecasDeXadrez.King;
import pecasDeXadrez.Rook;

public class ChessMatch {

	// Turno
	private int turn;
	// Cor da pe�a
	private Color currentPlayer;
	// Um tabuleiro para come�ar a partida
	private Board board;

	// A classe tem que saber a dimens�o
	// do tabuleiro de xadrez
	// Come�a com as pe�as brancas
	public ChessMatch() {
		board = new Board(8, 8);
		turn = 1;
		currentPlayer = Color.WHITE;
		initialSetup();
	}

	public int getTurn() {
		return this.turn;
	}

	public Color getCurrentPlayer() {
		return this.currentPlayer;
	}

	// Retornar uma matrix de pe�a de xadrez
	// corresponde a essa partida
	public ChessPiece[][] getPieces() {
		// Liberar as pe�as do tipo ChessPiece
		// com a quantida de linhas e colunas do tabuleiro
		ChessPiece mat[][] = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				// downcasting para ChessPiece
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

	// Opera��o para imprimir as posi��es poss�veis
	// A partir de uma posi��o de origem
	public boolean[][] possibleMoves(ChessPosition sourcePosition) {
		Position position = sourcePosition.toPosition();
		validateSourcePosition(position);
		return board.piece(position).possibleMoves();
	}

	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		validateSourcePosition(source);
		validateTargetPosition(source, target);
		Piece capturedPiece = makeMove(source, target);
		nextTurn();
		return (ChessPiece) capturedPiece;
	}

	// Recebe uma posi��o de origem e uma posi��o de destino
	private Piece makeMove(Position source, Position target) {
		Piece p = board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(p, target);
		return capturedPiece;
	}

	private void validateSourcePosition(Position position) {
		if (!board.thereIsAPiece(position)) {
			throw new ChessException("Nao existe peca na posicao de origem.");
		}
		if (currentPlayer != ((ChessPiece)board.piece(position)).getColor()) {
			throw new ChessException ("A peca escolhida nao e sua");
		}
		
		if (!board.piece(position).isThereAnyPossibleMove()) {
			throw new ChessException("Nao existe movimentos possiveis para a peca escolhida.");

		}
	}

	// Validar se a posi��o de destino
	// � valida em rela��o a posic�o de origem
	private void validateTargetPosition(Position source, Position target) {
		// Testar se essa posi��o de destino � um movimento poss�vel
		// em rela��o a pe�a que est�na posi��o de origem
		if (!board.piece(source).possibleMove(target)) {
			throw new ChessException("A peca escolhida nao pode se mover para a posicao de destino.");
		}

	}
	
	private void nextTurn () {
		turn ++;
		//Se o jogador atual for igual a Color.WHITE, ent�o agora
		// ele vai ser o Color.BLACK, caso contr�rio ele vai ser Color.WHITE
		currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		// Passa a pe�a e instanciar uma ChessPosition com os dados
		// Convertendo para a posi��o de matrix
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	// Respons�vel por iniciar a partida de Xadrez
	// Colocando as pe�as no tabuleiro
	private void initialSetup() {
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
