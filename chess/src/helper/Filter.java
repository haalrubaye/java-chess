package helper;

import java.util.ArrayList;
import chess.Board;
import helper.Miscellanous;
import helper.Manipulation;

public class Filter {
	
	public static String[] basicFilter(String[] moves, Board board, char color){
	
	    ArrayList<String> positions = new ArrayList<>();
		
		// Add positions needed to be removed to array
		for(String move: moves) {
			if (!move.contains(" ") && board.get(move).getColor() != color) {
				positions.add(move);
			}
		}
		
		return Manipulation.makeArray(positions);
	}
	public static String[] prepareMoves(Board board, String[] moves, int id) {
		
		ArrayList<String> newMoves = new ArrayList<>();
		
		String position = board.getPosition(id);
		char color = board.getColor(id);
		
		for (String move: moves) {
			// Up movement
			while (Manipulation.isUpOf(move, position, true)) {
				String newMove = Manipulation.up(position, 1);
					
				char moveColor = board.get(newMove).getColor();
					
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				if((moveColor == Miscellanous.colorFlip(color))) {
					break;
				}
			}
			
			// Down Movement
			while (Manipulation.isDownOf(move, position, true)) {
				String newMove = Manipulation.down(position, 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				if((moveColor == Miscellanous.colorFlip(color))) {
					break;
				}
			}
			
			// Right Movement
			while (Manipulation.isRightOf(move, position, true)) {
				String newMove = Manipulation.right(position, 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				if((moveColor == Miscellanous.colorFlip(color))) {
					break;
				}
			}
			
			// Left Movement
			while (Manipulation.isLeftOf(move, position, true)) {
				String newMove = Manipulation.left(position, 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				if((moveColor == Miscellanous.colorFlip(color))) {
					break;
				}
			}
			
			// Right-up diagonal movement
			while (Manipulation.isRightOf(move, position, false) && Manipulation.isUpOf(move, position, false)) {
				String newMove = Manipulation.up(Manipulation.right(position, 1), 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				if((moveColor == Miscellanous.colorFlip(color))) {
					break;
				}
			}
			
			// Right-down diagonal Movement
			while (Manipulation.isRightOf(move, position, false) && Manipulation.isDownOf(move, position, false)) {
				String newMove = Manipulation.down(Manipulation.right(position, 1), 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				if((moveColor == Miscellanous.colorFlip(color))) {
					break;
				}
			}
			
			// Left-up diagonal Movement
			while (Manipulation.isLeftOf(move, position, false) && Manipulation.isUpOf(move, position, false)) {
				String newMove = Manipulation.up(Manipulation.left(position, 1), 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				if((moveColor == Miscellanous.colorFlip(color))) {
					break;
				}
			}
			
			// Left-down diagonal Movement
			while (Manipulation.isLeftOf(move, position, false) && Manipulation.isDownOf(move, position, false)) {
				String newMove = Manipulation.down(Manipulation.left(position, 1), 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				if((moveColor == Miscellanous.colorFlip(color))) {
					break;
				}
			}
		}
		return Manipulation.makeArray(newMoves);
		
	}	
	public static String[] pawnFilter(Board board, int id) {
		
		// Array to get indexes of moves
		ArrayList<String> newMoves = new ArrayList<>();
		
		String position = board.getPosition(id);
		char color = board.getColor(id);
		
		try {
			if (board.get(Manipulation.right(Manipulation.up(position, 1), 1)).getColor() == Miscellanous.colorFlip(color)) {
				newMoves.add(Manipulation.right(Manipulation.up(position, 1), 1));
			}
		} catch(Exception e) {}
		
		try {
			if (board.get(Manipulation.left(Manipulation.up(position, 1), 1)).getColor() == Miscellanous.colorFlip(color)) {
				newMoves.add(Manipulation.left(Manipulation.up(position, 1), 1));
			}
		} catch(Exception e) {}
		
		try {
			if (board.get(Manipulation.up(position, 1)).getColor() == 'E') {
				newMoves.add(Manipulation.up(position, 1));
			}
		} catch(Exception e) {}
		
		return Manipulation.makeArray(newMoves);
	}
}