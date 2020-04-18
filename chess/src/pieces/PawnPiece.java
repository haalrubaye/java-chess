package pieces;

import chess.Board;
import helper.Filter;

public class PawnPiece extends ChessPiece{

	public PawnPiece(char color, int id) {
		super(color, id);
		// TODO Auto-generated constructor stub
	}

	public String[] getPossibleMoves(Board board) {
		
		// Makes array based on criteria 
		String[] moves = Filter.pawnFilter(board, id);
		return moves;
		
	}
	
	public String toString() {
		return color + "P";
	}
	
	
	
}
