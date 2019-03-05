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
		this.rows = rows;
		this.columns = columns;
		//A matriz de peças vai ser instaciada com piece
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
	
	//Retornar uma peça por vez
	public Piece piece (int row, int column) {
		return pieces[row][column];
	}
	
	//Sobrecarga do método recebendo uma posição
	//retornar a peça pela posição
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Recebe uma peçae uma posição
	public void placePiece (Piece piece, Position position ) {
		//Matriz de peças nessas posições
		//Atribuir a peça que veio no argumento
		pieces[position.getRow()] [position.getColumn()] = piece;
		//Essa peça não está na posição nula
		piece.position = position;

	}
}