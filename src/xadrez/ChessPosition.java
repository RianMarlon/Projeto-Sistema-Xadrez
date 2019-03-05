package xadrez;

import jogoDeTabuleiro.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException ("Erro instanciando ChessPosition. Valores validos s�o de a1 ate h8.");
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

	//Converter a posi��o de xadrez para a posi��o comum
	protected Position toPosition () {
		//A linha da posi��o vai ser 8 menos a linha da posi��o do Xadrez
		//A coluna da posi��o vai ser a coluna do Xadrez menos o caractere 'a'
		return new Position ( 8 - row, column - 'a');
	}

	//Converter a posi��o de comum para a posi��o de xadrez
	protected static ChessPosition fromPosition (Position position) {
		//Opera��o inversa do m�todo toPosition com casting para char
		return new ChessPosition ((char)( 'a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString () {
		return "" + column + row;
	}
}
