package pieces;

import chess.Board;
import helper.Filter;
import helper.Manipulation;

public class QueenPiece extends ChessPiece{

	
	public QueenPiece(char color, int id) {
		super(color, id);
		// TODO Auto-generated constructor stub
	}

	public String[] getPossibleMoves(Board board) {
		
		String position = board.getPosition(id);
		
	 	String letterPosition = Character.toString(Manipulation.getChar(position));
	 	String numberPosition = Integer.toString(Manipulation.getInt(position));
		
		String[] moves = {
						  											  
				  			// Left Movement
						  	"A" + numberPosition,
						  													  
						  	// Right Movement
						  	"H" + numberPosition,
						  											  
						  	// Down Movement
							letterPosition + "1",
							
							// Up Movement
							letterPosition + "8",
									
							// Right-up Movement
							"H8",
							
							// Right-down Movement
							"H1",
							
							// Left-up Movement
							"A8",
							
							// Left-down Movement
							"A1"
		};
		
		
		
		// Does big filtering
		moves = Filter.prepareMoves(board, moves, id);
		
		return moves;
		
	}
	
	public String toString() {
		return color + "Q";
	}
	
	
}
