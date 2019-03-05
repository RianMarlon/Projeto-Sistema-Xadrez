//Exceção na camada de Xadrez

package xadrez;

import jogoDeTabuleiro.BoardException;

public class ChessException extends BoardException {

	private static final long serialVersionUID = 1L;
	
	public ChessException (String message) {
		super (message);
		
	}

}
