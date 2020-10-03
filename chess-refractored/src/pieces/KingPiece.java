package pieces;

import chess.Board;
import helper.Evaluator;
import helper.Filter;

public class KingPiece extends ChessPiece{
	

	
	public KingPiece(char color, int id) {
		super(color, id);
		// TODO Auto-generated constructor stub
	}

	public String[] getPossibleMoves(Board board) {
		
		String position = board.getPosition(id);
		
		String[] moves = {
						  Evaluator.up(position, 1), 
						  Evaluator.left(Evaluator.up(position, 1), 1), 
						  Evaluator.right(Evaluator.up(position, 1), 1), 
						  
						  
						  Evaluator.right(position, 1),
						  Evaluator.left(position, 1),
						  
						  
						  Evaluator.down(position, 1), 
						  Evaluator.left(Evaluator.down(position, 1), 1), 
						  Evaluator.right(Evaluator.down(position, 1), 1), 
						  }; 
		
		// Filters array from inaccurate moves
		moves = Filter.basicFilter(moves, board, color);
		
		return moves;
		
	}
	
	public String toString() {
		return color + "K";
	}
	
}
