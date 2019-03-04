//Classe tabuleiro

package jogoDeTabuleiro;

public class Board {
	
	//linhas
	private int rows;
	//colunas
	private  int columns;
	//matriz de peças
	private Piece pieces [][];
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
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


}
