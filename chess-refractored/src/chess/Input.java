package chess;

import java.util.Arrays;
import java.util.Scanner;
import chess.Board;
import chess.Move;
import helper.Miscellanous;

public class Input {
	
	public static String promotionPrompt(Scanner reader) {
		
		System.out.println("What do you want your pawn to be promoted to? (Queen, Rook, Bishop, Horse)");
		
		String[] pieces = new String[] {"Queen", "Rook", "Bishop", "Horse"};
		String choice = "";
		
		while (Arrays.asList(pieces).indexOf(choice) != -1) {
			choice = reader.nextLine();
		}
		return choice;
	}
	
	
	public static Move movePrompt(char player, Board board, Scanner reader) {
	
		while (true) {
			
			System.out.println("\nEnter piece to move:");
			String piece = reader.next();
			
			try {
				String[] possibleMoves = board.get(piece).getPossibleMoves(board);
				Miscellanous.printArray(possibleMoves);
				
				System.out.println("Enter position of target (Or enter space to change piece):");
				String target = reader.next();
				
				if(Arrays.asList(possibleMoves).indexOf(target) != -1) {
					System.out.println("Move passed first check phase.");
					return new Move(piece, target);
				}
				
			} catch(Exception e) {
				System.out.println("Invalid move. Try again");
			}
			
		}
	}
}
