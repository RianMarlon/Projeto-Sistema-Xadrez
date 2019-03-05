//Classe peça

package jogoDeTabuleiro;

public class Piece {

	//Posição no tabuleiro
	protected Position position;
	//Tabuleiro
	private Board board;

	//inicia tabuleiro para as peças
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	//Somente classes do mesmo pacote
	//e subclasses de Piece que vão acessar o tabuleiro de uma peça
	protected Board getTabuleiro() {
		return board;
	}

}
