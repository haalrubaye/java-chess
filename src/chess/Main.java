package chess;

import chess.Input;
import helper.Miscellanous;
import chess.Board;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// NEED TO CHANGE MAJOR THING, CHESS PIECES NO LONGER NEED TO HAVE POSITION VALUES
		
		Board board = new Board();
		Scanner reader = new Scanner(System.in);
		String move;
		
		System.out.println("Welcome to the chess game\n");
		
		char playerColor = Input.colorPrompt(reader);
		
		char computerColor = Miscellanous.colorFlip(playerColor);
		
		board.draw();
		
		if(playerColor == 'W') {
			while (true) {
				
				
				move = Input.movePrompt(reader);
				
				while(board.isMoveInvalid(move, playerColor)) {
					System.out.println("Invalid move. Try again.");
					move = Input.movePrompt(reader);
				}
	
				
				board.draw();
				
				if(board.isCheckmate(playerColor, computerColor)) {
					System.out.println("Game ends. Player '" + Character.toString(playerColor) + "' wins.");
					break;
				}
				
				if(board.isStalemate(playerColor, computerColor)) {
					System.out.println("Game ends. It's a tie.");
					break;
				}
				
				board.draw();
				
				board.computerMove();
				if(board.isCheckmate(computerColor, playerColor)) {
					System.out.println("Game ends. Computer '" + Character.toString(computerColor) + "' wins.");
					break;
				}
				
				if(board.isStalemate(computerColor, playerColor)) {
					System.out.println("Game ends. It's a tie.");
					break;
				}
				
				board.revDraw();
				
				
			}
		}
		
		if(playerColor == 'B') {
			while (true) {
				
				
				board.computerMove();
				if(board.isCheckmate(computerColor, playerColor)) {
					System.out.println("Game ends. Computer '" + Character.toString(computerColor) + "' wins.");
					break;
				}
				
				if(board.isStalemate(computerColor, playerColor)) {
					System.out.println("Game ends. It's a tie.");
					break;
				}
				
				board.revDraw();
				
				move = Input.movePrompt(reader);
				
				while(board.isMoveInvalid(move, playerColor)) {
					System.out.println("Invalid move. Try again.");
					move = Input.movePrompt(reader);
				}
				
				if(board.isCheckmate(playerColor, computerColor)) {
					System.out.println("Game ends. Player '" + Character.toString(playerColor) + "' wins.");
					break;
				}
				
				if(board.isStalemate(playerColor, computerColor)) {
					System.out.println("Game ends. It's a tie.");
					break;
				}
				
				board.draw();
			}
		}
		
		System.out.println("Game Over.");
	}
}