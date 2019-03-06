//Classe pe�a

package jogoDeTabuleiro;

public abstract class Piece {

	// Posi��o no tabuleiro
	protected Position position;
	// Tabuleiro
	private Board board;

	// inicia tabuleiro para as pe�as
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	// Somente classes do mesmo pacote
	// e subclasses de Piece que v�o acessar o tabuleiro de uma pe�a
	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	// Recebe uma posi��o e vai retornar true ou false
	// se � poss�vel essa pe�a mover para essa dada posi��o
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
