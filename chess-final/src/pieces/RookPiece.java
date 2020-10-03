package pieces;

import chess.Board;
import helper.Evaluator;
import helper.Filter;

public class RookPiece extends ChessPiece{

	public RookPiece(char color, int id) {
		super(color, id);
		// TODO Auto-generated constructor stub
	}
	
	public String[] getPossibleMoves(Board board) {
		
		String position = board.getPosition(id);
		
	 	String letterPosition = Character.toString(Evaluator.getChar(position));
	 	String numberPosition = Integer.toString(Evaluator.getInt(position));
	 	
		String[] moves = { 
				// Left Movement
			  	"A" + numberPosition,
			  													  
			  	// Right Movement
			  	"H" + numberPosition,
			  											  
			  	// Down Movement
				letterPosition + "1",
				
				// Up Movement
				letterPosition + "8"
		};
		
		moves = Filter.prepareMoves(board, moves, id);
		
		return moves;
	}
	
	
	
	public String toString() {
		return color + "R";
	}
}
