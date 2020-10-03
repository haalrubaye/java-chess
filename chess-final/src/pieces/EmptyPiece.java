package pieces;

import chess.Board;

public class EmptyPiece extends ChessPiece{
	
	public EmptyPiece(int id) {
		super(id);
		this.color = 'E';
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "  ";
	}
	
	public String[] getPossibleMoves(Board board) {
		String[] moves = new String[]{"No moves"};
		return moves;
	}
	
}
