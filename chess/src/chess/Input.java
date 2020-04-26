package chess;

import java.util.Arrays;
import java.util.Scanner;

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
	
	public static char colorPrompt(Scanner reader) {
	
		System.out.println("What color would you like to be? (White or Black)");

		char color = reader.next().charAt(0);;

		while (!(color == 'W' || color == 'B')) {
			color = reader.next().charAt(0);
		}
	
		return color;
	}
	
	public static String movePrompt(Scanner reader, Board board) {
	
		while (true) {
			
			System.out.println("\nEnter position of attacker:");
			String attacker = reader.next();
			
			try {
				String[] allMoves = board.get(attacker).getPossibleMoves(board);
				Miscellanous.printArray(allMoves);
				
				System.out.println("Enter position of target (Or enter space to change attacker):");
				String victim = reader.next();
				
				if(!victim.contains(" ") || Arrays.asList(allMoves).indexOf(victim) == -1) {
					return attacker + "-->" + victim;
				}
				
			} catch(Exception e) {
				System.out.println("Invalid move. Try again");
			}
			
		}
	}
}
