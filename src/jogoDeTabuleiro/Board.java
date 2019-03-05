//Classe tabuleiro

package jogoDeTabuleiro;

public class Board {
	
	//linhas
	private int rows;
	//colunas
	private  int columns;
	//matriz de peças (Um tabuleiro tem varias peças)
	private Piece pieces [][];
	
	//Receber quantidade de linhas e de colunas
	public Board(int rows, int columns) {
		if (rows < 1 ||  columns < 1 ) {
			throw new BoardException ("Erro criando tabuleiro: necessario que aja pelo menos 1 linha e 1 coluna");
		}
		this.rows = rows;
		this.columns = columns;
		//A matriz de peças vai ser instaciada com piece
		//na quantidade de linhas informada e na quantidade de colunas informadas
		pieces = new Piece [rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	//Retornar uma peça por vez
	public Piece piece (int row, int column) {
		if (!positionExists(row,column)) {
			throw new BoardException("Essa posicao nao existe no tabuleiro");
		}
		return pieces[row][column];
	}
	
	//Sobrecarga do método recebendo uma posição
	//retornar a peça pela posição
	public Piece piece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Essa posicao nao existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Recebe uma peçae uma posição
	public void placePiece (Piece piece, Position position ) {
		if (thereIsAPiece(position)) {
			throw new BoardException ("Ja existe uma peca na posicao "+ position);
		}
		//Matriz de peças nessas posições
		//Atribuir a peça que veio no argumento
		pieces[position.getRow()] [position.getColumn()] = piece;
		//Essa peça não está na posição nula
		piece.position = position;
	}
	
	public Piece removePiece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException ("Essa posicao nao existe");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces [position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	private boolean positionExists (int row, int column) {
		return row >= 0 && row < rows && column>= 0 && column < columns;
	}
	
	//Pega uma posição e fala se essa posição existe ou não
	public boolean positionExists (Position position) {
		return positionExists (position.getRow(), position.getColumn());
		
	}
	
	//Testar se tem uma peça nessa posição
	public boolean thereIsAPiece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Essa posicao nao existe no tabuleiro");
		}
		return piece(position) != null;
		
	}
}