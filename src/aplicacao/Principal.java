package aplicacao;

import jogoDeTabuleiro.Board;
import jogoDeTabuleiro.Position;

public class Principal {

	public static void main(String[] args) {
		
		Position position = new Position(3, 5);
		System.out.println(position.toString());
		
		Board board = new Board (8, 8);

	}

}
