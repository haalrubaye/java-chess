package pieces;

import helper.Manipulation;
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
							Manipulation.right(Manipulation.up(position, 2), 1),
							Manipulation.left(Manipulation.up(position, 2), 1),
				
							Manipulation.right(Manipulation.up(position, 1), 2),
							Manipulation.left(Manipulation.up(position, 1), 2),
				
							
							Manipulation.right(Manipulation.down(position, 1), 2),
							Manipulation.left(Manipulation.down(position, 1), 2),
							
							Manipulation.right(Manipulation.down(position, 2), 1),
							Manipulation.left(Manipulation.down(position, 2), 1)
		};
		
		moves = Filter.basicFilter(moves, board, color);
		
		return moves;
	}
	
	
	
	public String toString() {
		return color + "K";
	}
	
}
