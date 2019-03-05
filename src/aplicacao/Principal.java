package aplicacao;

import java.util.Scanner;

import xadrez.ChessMatch;
import xadrez.ChessPiece;
import xadrez.ChessPosition;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		ChessMatch chessMatch =  new ChessMatch();
		
		while (true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.print("Souce: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Target: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}

}
