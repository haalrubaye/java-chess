package helper;

public class Miscellanous {
	
	public static char colorFlip(char color) {
		if(color == 'W') {
			return 'B';
		}
		else if(color == 'B') {
			return 'W';
		}
		return 'E';
	}
	
//	public static boolean canGoThere(HashMap<String, ChessPiece> board, String move, char color) {
//		if(board.get(move).getColor() != color && (!move.contains(" "))) {
//			return true;
//		}
//		return false;
//		
//	}

	
	


}
