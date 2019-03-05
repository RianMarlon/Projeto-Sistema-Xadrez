package aplicacao;

import jogoDeTabuleiro.Board;
import xadrez.ChessPiece;

public class UI {

	//Imprimir o tabuleiro
	public static void printBoard(ChessPiece[][] pieces) {
		//for para percorrer as linhas e as colunas
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + "  ");
			for (int j = 0; j < pieces.length; j++) {
				//Imprimir a peça
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("    a  b  c  d  e  f  g  h");
	}

	private static void printPiece(ChessPiece piece) {
		//Não tinha peça nessa posição do tabuleiro se for nulo
		if (piece == null) {
			System.out.print(" -");
		} else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}

}
