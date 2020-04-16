package pieces;

import chess.Board;
import helper.Manipulation;
import helper.Filter;

public class KingPiece extends ChessPiece{
	

	
	public KingPiece(char color, int id) {
		super(color, id);
		// TODO Auto-generated constructor stub
	}

	public String[] getPossibleMoves(Board board) {
		
		String position = board.getPosition(id);
		
		String[] moves = {
						  Manipulation.up(position, 1), 
						  Manipulation.left(Manipulation.up(position, 1), 1), 
						  Manipulation.right(Manipulation.up(position, 1), 1), 
						  
						  
						  Manipulation.right(position, 1),
						  Manipulation.left(position, 1),
						  
						  
						  Manipulation.down(position, 1), 
						  Manipulation.left(Manipulation.down(position, 1), 1), 
						  Manipulation.right(Manipulation.down(position, 1), 1), 
						  }; 
		
		// Filters array from inaccurate moves
		moves = Filter.basicFilter(moves, board, color);
		
		return moves;
		
	}
	
	public String toString() {
		return color + "K";
	}
	
}
