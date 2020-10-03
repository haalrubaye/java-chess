package chess;

import chess.Input;
import chess.Board;
import java.util.Scanner;
import chess.Move;

public class Main {
	public static void main(String[] args) {
		// MUST CHANGE - NEED TO ADD MOVE AND POSITION CLASSES/ OBJECTS
		
		Board board = new Board();
		Scanner reader = new Scanner(System.in);
		Move move;
		char[] players = {'W', 'B'};
		
		System.out.println("Welcome to the chess game\n");
		
		
		outerloop:
		while (true) {
				for (char player: players) {
					board.draw();
					System.out.println("starting as " + player);
					move = Input.movePrompt(player, board, reader);
					
					
					while(board.isMoveInvalid(player, move)) {
						System.out.println("Invalid move. Try again.");
						move = Input.movePrompt(player, board, reader);
					}
					
					System.out.println("starting checkmate test");
					// Did player checkmate other player
					if(board.isCheckmate(player)) {
						System.out.println("Game ends. " + player + " wins.");
						break outerloop;
					}
					
					System.out.println("Tested checkmate");
					
					// Did player stalemate other player
					if(board.isStalemate(player)) {
						System.out.println("Game ends. It's a tie.");
						break outerloop;
					}
					
					System.out.println("Tested stalemate");
				}
			}

		System.out.println("Game Over.");
	}
}