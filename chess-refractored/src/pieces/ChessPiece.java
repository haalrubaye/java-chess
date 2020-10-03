package pieces;

import chess.Board;

public class ChessPiece {
	
	char color;
	int id;
	
	public ChessPiece(/*int id,*/char color, int id) {
		//this.id = id;
		this.color = color;
		this.id = id;
	}
	
	public ChessPiece(int id) {
		this.id = id;
	}
	
	public char getColor() {
		return color;
	}
	
	public int getId() {
		return id;
	}
	
	public String[] getPossibleMoves(Board board) {
		String[] moves = new String[1];
		return moves;
	}
	
}
