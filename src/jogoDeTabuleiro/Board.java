//Classe tabuleiro

package jogoDeTabuleiro;

public class Board {
	
	//linhas
	private int rows;
	//colunas
	private  int columns;
	//matriz de pe�as (Um tabuleiro tem varias pe�as)
	private Piece pieces [][];
	
	//Receber quantidade de linhas e de colunas
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//A matriz de pe�as vai ser instaciada com piece
		//na quantidade de linhas informada e na quantidade de colunas informadas
		pieces = new Piece [rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//Retornar uma pe�a por vez
	public Piece piece (int row, int column) {
		return pieces[row][column];
	}
	
	//Sobrecarga do m�todo recebendo uma posi��o
	//retornar a pe�a pela posi��o
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Recebe uma pe�ae uma posi��o
	public void placePiece (Piece piece, Position position ) {
		//Matriz de pe�as nessas posi��es
		//Atribuir a pe�a que veio no argumento
		pieces[position.getRow()] [position.getColumn()] = piece;
		//Essa pe�a n�o est� na posi��o nula
		piece.position = position;

	}
}