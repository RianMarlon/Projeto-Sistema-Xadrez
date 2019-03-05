package xadrez;

import jogoDeTabuleiro.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException ("Erro instanciando ChessPosition. Valores validos são de a1 ate h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	//Converter a posição de xadrez para a posição comum
	protected Position toPosition () {
		//A linha da posição vai ser 8 menos a linha da posição do Xadrez
		//A coluna da posição vai ser a coluna do Xadrez menos o caractere 'a'
		return new Position ( 8 - row, column - 'a');
	}

	//Converter a posição de comum para a posição de xadrez
	protected static ChessPosition fromPosition (Position position) {
		//Operação inversa do método toPosition com casting para char
		return new ChessPosition ((char)( 'a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString () {
		return "" + column + row;
	}
}
