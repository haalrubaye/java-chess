package helper;

import java.util.ArrayList;
import chess.Board;
import helper.Miscellanous;
import helper.Evaluator;

public class Filter {
	
	public static String[] basicFilter(String[] moves, Board board, char color){
	
	    ArrayList<String> positions = new ArrayList<>();
		
		// Add positions needed to be removed to array
		for(String move: moves) {
			if (!move.contains(" ") && board.get(move).getColor() != color) {
				positions.add(move);
			}
		}
		
		return Evaluator.makeArray(positions);
	}
	public static String[] prepareMoves(Board board, String[] moves, int id) {
		
		ArrayList<String> newMoves = new ArrayList<>();
		
		String position = board.getPosition(id);
		char color = board.getColor(id);
		
		for (String move: moves) {
			// Up movement
			while (Evaluator.isUpOf(move, position, true)) {
				String newMove = Evaluator.up(position, 1);
				
				char moveColor = board.get(newMove).getColor();
					
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				position = newMove;
				if((moveColor != 'E')) {
					break;
				}
			}
			
			position = board.getPosition(id);
			
			// Down Movement
			while (Evaluator.isDownOf(move, position, true)) {
				String newMove = Evaluator.down(position, 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				position = newMove;
				if((moveColor != 'E')) {
					break;
				}
			}
			
			position = board.getPosition(id);
			
			// Right Movement
			while (Evaluator.isRightOf(move, position, true)) {
				String newMove = Evaluator.right(position, 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				position = newMove;
				if((moveColor != 'E')) {
					break;
				}
			}
			
			position = board.getPosition(id);
			
			// Left Movement
			while (Evaluator.isLeftOf(move, position, true)) {
				String newMove = Evaluator.left(position, 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				position = newMove;
				if((moveColor != 'E')) {
					break;
				}
			}
			
			position = board.getPosition(id);
			
			// Right-up diagonal movement
			while (Evaluator.isRightOf(move, position, false) && Evaluator.isUpOf(move, position, false)) {
				String newMove = Evaluator.up(Evaluator.right(position, 1), 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				position = newMove;
				if((moveColor != 'E')) {
					break;
				}
			}
			
			position = board.getPosition(id);
			
			// Right-down diagonal Movement
			while (Evaluator.isRightOf(move, position, false) && Evaluator.isDownOf(move, position, false)) {
				String newMove = Evaluator.down(Evaluator.right(position, 1), 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				position = newMove;
				if((moveColor != 'E')) {
					break;
				}
			}
			
			position = board.getPosition(id);
			
			// Left-up diagonal Movement
			while (Evaluator.isLeftOf(move, position, false) && Evaluator.isUpOf(move, position, false)) {
				String newMove = Evaluator.up(Evaluator.left(position, 1), 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				position = newMove;
				if((moveColor != 'E')) {
					break;
				}
			}
			
			position = board.getPosition(id);
			
			// Left-down diagonal Movement
			while (Evaluator.isLeftOf(move, position, false) && Evaluator.isDownOf(move, position, false)) {
				String newMove = Evaluator.down(Evaluator.left(position, 1), 1);
				
				char moveColor = board.get(newMove).getColor();
				
				if(moveColor == color) {
					break;
				}
				newMoves.add(newMove);
				position = newMove;
				if((moveColor != 'E')) {
					break;
				}
			}
			
			position = board.getPosition(id);
			
		}
		return Evaluator.makeArray(newMoves);
		
	}	
	public static String[] pawnFilter(Board board, int id) {
		
		
		// TODO make a different pawn filter for black pawns, since they go other have to account for them 
		
		// Array to get indexes of moves
		ArrayList<String> newMoves = new ArrayList<>();
		
		String position = board.getPosition(id);
		char color = board.getColor(id);
		
		if (color == 'W') {
			
			try {
				if (board.get(Evaluator.right(Evaluator.up(position, 1), 1)).getColor() == Miscellanous.colorFlip(color)) {
					newMoves.add(Evaluator.right(Evaluator.up(position, 1), 1));
				}
			} catch(Exception e) {}
			
			try {
				if (board.get(Evaluator.left(Evaluator.up(position, 1), 1)).getColor() == Miscellanous.colorFlip(color)) {
					newMoves.add(Evaluator.left(Evaluator.up(position, 1), 1));
				}
			} catch(Exception e) {}
			
			try {
				if (board.get(Evaluator.up(position, 1)).getColor() == 'E') {
					newMoves.add(Evaluator.up(position, 1));
				}
			} catch(Exception e) {}
			
			try {
				if (board.get(Evaluator.up(position, 1)).getColor() == 'E' && board.get(Evaluator.up(position, 2)).getColor() == 'E' && helper.Evaluator.getInt(position) == 2) {
					newMoves.add(Evaluator.up(position, 2));
				}
			} catch(Exception e) {}
		}
		
		else {
			
			try {
				if (board.get(Evaluator.left(Evaluator.down(position, 1), 1)).getColor() == Miscellanous.colorFlip(color)) {
					newMoves.add(Evaluator.left(Evaluator.down(position, 1), 1));
				}
			} catch(Exception e) {}
			
			try {
				if (board.get(Evaluator.right(Evaluator.down(position, 1), 1)).getColor() == Miscellanous.colorFlip(color)) {
					newMoves.add(Evaluator.right(Evaluator.down(position, 1), 1));
				}
			} catch(Exception e) {}
			
			try {
				if (board.get(Evaluator.down(position, 1)).getColor() == 'E') {
					newMoves.add(Evaluator.down(position, 1));
				}
			} catch(Exception e) {}
			
			try {
				if (board.get(Evaluator.down(position, 1)).getColor() == 'E' && board.get(Evaluator.down(position, 2)).getColor() == 'E'&& helper.Evaluator.getInt(position) == 7) {
					newMoves.add(Evaluator.down(position, 2));
				}
			} catch(Exception e) {}
		}
			
		return Evaluator.makeArray(newMoves);
	}
}