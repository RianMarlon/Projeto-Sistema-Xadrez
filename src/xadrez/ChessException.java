//Exceção na camada de Xadrez

package xadrez;

public class ChessException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ChessException (String message) {
		super (message);
		
	}

}
