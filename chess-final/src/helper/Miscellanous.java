package helper;

import java.util.Random;

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
	
	public static char generateColor() {
		Random random = new Random();
		char[] colours = {'W', 'B'};
		
		return colours[random.nextInt(2)];
	}
	
	public static void printArray(String[] array) {
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
//	public static boolean canGoThere(HashMap<String, ChessPiece> board, String move, char color) {
//		if(board.get(move).getColor() != color && (!move.contains(" "))) {
//			return true;
//		}
//		return false;
//		
//	}

	
	


}
