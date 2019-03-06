//Classe peça

package jogoDeTabuleiro;

public abstract class Piece {

	// Posição no tabuleiro
	protected Position position;
	// Tabuleiro
	private Board board;

	// inicia tabuleiro para as peças
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	// Somente classes do mesmo pacote
	// e subclasses de Piece que vão acessar o tabuleiro de uma peça
	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	// Recebe uma posição e vai retornar true ou false
	// se é possível essa peça mover para essa dada posição
	public boolean possibleMove(Position position) {
		return possibleMoves() [position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
