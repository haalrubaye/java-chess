package pieces;

import chess.Board;
import helper.Filter;

public class BishopPiece extends ChessPiece{
	
	public BishopPiece(char color, int id) {
		super(color, id);
		// TODO Auto-generated constructor stub
	}

	public String[] getPossibleMoves(Board board) {
		String[] moves = {  
				// Right-up Movement
				"H8",
				
				// Right-down Movement
				"H1",
				
				// Left-up Movement
				"A8",
				
				// Left-down Movement
				"A1"
		};
		
		
		moves = Filter.prepareMoves(board, moves, id);
		
		return moves;
	}
	
	public String toString() {
		return color + "B";
	}
	
}
