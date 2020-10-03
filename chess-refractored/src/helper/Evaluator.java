package helper;

import java.util.ArrayList;
import java.util.Arrays;

public class Evaluator {


	public static String up(String position, int amount) {
		int numPos = getInt(position) + amount;
		if(numPos > 8) {
			return "  ";
		}
		return Character.toString(getChar(position)) + Integer.toString(numPos);
	}
	public static String down(String position, int amount) {
		int numPos = getInt(position) - amount;
		if(numPos < 1) {
			return "  ";
		}
		return Character.toString(getChar(position)) + Integer.toString(numPos);
	}
	public static String left(String position, int amount) {
		ArrayList<Character> letters = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'));
		try {
			return Character.toString(letters.get(letters.indexOf(getChar(position)) - amount)) + Integer.toString(getInt(position));
		}catch(Exception e) {
			return "  ";
		}
		
	}
	public static String right(String position, int amount) {
		ArrayList<Character> letters = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'));		
		try {
			return Character.toString(letters.get(letters.indexOf(getChar(position)) + amount)) + Integer.toString(getInt(position));
		}catch(Exception e) {
			return "  ";
		}
	}
	
	public static boolean isUpOf(String pos1, String pos2, boolean strict) {
		boolean val;
		if (strict) {
			val =  (getInt(pos1) > getInt(pos2)) && (getChar(pos1) == getChar(pos2)) ? true : false;
		} else {
			val =  getInt(pos1) > getInt(pos2) ? true : false;
		}
		return val;
	}
	public static boolean isDownOf(String pos1, String pos2, boolean strict) {
		boolean val;
		if (strict) {
			val =  (getInt(pos1) < getInt(pos2)) && (getChar(pos1) == getChar(pos2)) ? true : false;
		} else {
			val =  getInt(pos1) < getInt(pos2) ? true : false;
		}
		return val;
	}
	public static boolean isRightOf(String pos1, String pos2, boolean strict) {
		boolean val;
		if (strict) {
			val =  getInt(pos1) == getInt(pos2) && letterLocator(getChar(pos1)) > letterLocator(getChar(pos2)) ? true : false;
		} else {
			val =  letterLocator(getChar(pos1)) > letterLocator(getChar(pos2)) ? true : false;
		}
		return val;
	}
	public static boolean isLeftOf(String pos1, String pos2, boolean strict) {
		boolean val;
		if (strict) {
			val =  getInt(pos1) == getInt(pos2) && letterLocator(getChar(pos1)) < letterLocator(getChar(pos2)) ? true : false;
		} else {
			val =  letterLocator(getChar(pos1)) < letterLocator(getChar(pos2)) ? true : false;
		}
		return val;
	}
	
	public static int letterLocator(char letter) {
		ArrayList<Character> letters = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'));
		
		return letters.indexOf(letter) + 1;
	}
	
	
	public static int getInt(String string) {
		 return Integer.parseInt(string.substring(1)); 
	}
	public static char getChar(String string) {
		return string.charAt(0);
	}
	public static String[] makeArray(ArrayList<String> before) {
		String[] after = new String[before.size()];
		for(int x = 0; x < after.length; x++) {
			after[x] = before.get(x);
		}
		return after;
	}
		
}