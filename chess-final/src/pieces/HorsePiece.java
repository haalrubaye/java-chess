package pieces;

import helper.Evaluator;
import helper.Filter;

import chess.Board;

public class HorsePiece extends ChessPiece {
	
	public HorsePiece(char color, int id) {
		super(color, id);
		// TODO Auto-generated constructor stub
	}



	public String[] getPossibleMoves(Board board) {
		
		String position = board.getPosition(id);
		
		String[] moves = {  
							Evaluator.right(Evaluator.up(position, 2), 1),
							Evaluator.left(Evaluator.up(position, 2), 1),
				
							Evaluator.right(Evaluator.up(position, 1), 2),
							Evaluator.left(Evaluator.up(position, 1), 2),
				
							
							Evaluator.right(Evaluator.down(position, 1), 2),
							Evaluator.left(Evaluator.down(position, 1), 2),
							
							Evaluator.right(Evaluator.down(position, 2), 1),
							Evaluator.left(Evaluator.down(position, 2), 1)
		};
		
		moves = Filter.basicFilter(moves, board, color);
		
		return moves;
	}
	
	
	
	public String toString() {
		return color + "K";
	}
	
}
