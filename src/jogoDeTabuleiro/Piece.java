//Classe pe�a

package jogoDeTabuleiro;

public class Piece {

	//Posi��o no tabuleiro
	protected Position position;
	//Tabuleiro
	private Board board;

	//inicia tabuleiro para as pe�as
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	//Somente classes do mesmo pacote
	//e subclasses de Piece que v�o acessar o tabuleiro de uma pe�a
	protected Board getTabuleiro() {
		return board;
	}

}
