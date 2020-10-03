package chess;

public class Move {
	
	String piece;
	String target;
	
	public Move(String piece, String target) {
		this.piece = piece;
		this.target = target;
	}
	
	public String getPiece() {
		return piece;
	}
	public String getTarget() {
		return target;
	}
}
