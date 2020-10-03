package chess;

import java.util.Arrays;
import java.util.HashMap;

import helper.Miscellanous;

import chess.Move;

import pieces.BishopPiece;
import pieces.ChessPiece;
import pieces.EmptyPiece;
import pieces.HorsePiece;
import pieces.QueenPiece;
import pieces.RookPiece;
import pieces.PawnPiece;
import pieces.KingPiece;

public class Board {
	
	HashMap<String, ChessPiece> board = new HashMap<String, ChessPiece>();
	
	public Board() {
		
		put("A1", new RookPiece('W', 1));
		put("B1", new HorsePiece('W', 2));
		put("C1", new BishopPiece('W', 3));
		put("D1", new QueenPiece('W', 4));
		put("E1", new KingPiece('W', 5));
		put("F1", new BishopPiece('W', 6));
		put("G1", new HorsePiece('W', 7));
		put("H1", new RookPiece('W', 8));
		
		put("A2", new PawnPiece('W', 9));
		put("B2", new PawnPiece('W', 10));
		put("C2", new PawnPiece('W', 11));
		put("D2", new PawnPiece('W', 12));
		put("E2", new PawnPiece('W', 13));
		put("F2", new PawnPiece('W', 14));
		put("G2", new PawnPiece('W', 15));
		put("H2", new PawnPiece('W', 16));
		
		put("A3", new EmptyPiece(17));
		put("B3", new EmptyPiece(18));
		put("C3", new EmptyPiece(19));
		put("D3", new EmptyPiece(20));
		put("E3", new EmptyPiece(21));
		put("F3", new EmptyPiece(22));
		put("G3", new EmptyPiece(23));
		put("H3", new EmptyPiece(24));
		
		put("A4", new EmptyPiece(25));
		put("B4", new EmptyPiece(26));
		put("C4", new EmptyPiece(27));
		put("D4", new EmptyPiece(28));
		put("E4", new EmptyPiece(29));
		put("F4", new EmptyPiece(30));
		put("G4", new EmptyPiece(31));
		put("H4", new EmptyPiece(32));
		
		put("A5", new EmptyPiece(33));
		put("B5", new EmptyPiece(34));
		put("C5", new EmptyPiece(35));
		put("D5", new EmptyPiece(36));
		put("E5", new EmptyPiece(37));
		put("F5", new EmptyPiece(38));
		put("G5", new EmptyPiece(39));
		put("H5", new EmptyPiece(40));
		
		put("A6", new EmptyPiece(41));
		put("B6", new EmptyPiece(42));
		put("C6", new EmptyPiece(43));
		put("D6", new EmptyPiece(44));
		put("E6", new EmptyPiece(45));
		put("F6", new EmptyPiece(46));
		put("G6", new EmptyPiece(47));
		put("H6", new EmptyPiece(48));
		
		put("A7", new PawnPiece('B', 49));
		put("B7", new PawnPiece('B', 50));
		put("C7", new PawnPiece('B', 51));
		put("D7", new PawnPiece('B', 52));
		put("E7", new PawnPiece('B', 53));
		put("F7", new PawnPiece('B', 54));
		put("G7", new PawnPiece('B', 55));
		put("H7", new PawnPiece('B', 56));
		
		put("A8", new RookPiece('B', 57));
		put("B8", new HorsePiece('B', 58));
		put("C8", new BishopPiece('B', 59));
		put("D8", new QueenPiece('B', 60));
		put("E8", new KingPiece('B', 61));
		put("F8", new BishopPiece('B', 62));
		put("G8", new HorsePiece('B', 63));
		put("H8", new RookPiece('B', 64));
		
	}
	
	public void draw() {
		System.out.println(8 + "   " + board.get("A8") + " | " + board.get("B8") + " | " + board.get("C8") + " | " + board.get("D8") + " | " + board.get("E8") + " | " + board.get("F8") + " | " + board.get("G8") + " | " + board.get("H8"));
		System.out.println(7 + "   " + board.get("A7") + " | " + board.get("B7") + " | " + board.get("C7") + " | " + board.get("D7") + " | " + board.get("E7") + " | " + board.get("F7") + " | " + board.get("G7") + " | " + board.get("H7"));
		System.out.println(6 + "   " + board.get("A6") + " | " + board.get("B6") + " | " + board.get("C6") + " | " + board.get("D6") + " | " + board.get("E6") + " | " + board.get("F6") + " | " + board.get("G6") + " | " + board.get("H6"));
		System.out.println(5 + "   " + board.get("A5") + " | " + board.get("B5") + " | " + board.get("C5") + " | " + board.get("D5") + " | " + board.get("E5") + " | " + board.get("F5") + " | " + board.get("G5") + " | " + board.get("H5"));
		System.out.println(4 + "   " + board.get("A4") + " | " + board.get("B4") + " | " + board.get("C4") + " | " + board.get("D4") + " | " + board.get("E4") + " | " + board.get("F4") + " | " + board.get("G4") + " | " + board.get("H4"));
		System.out.println(3 + "   " + board.get("A3") + " | " + board.get("B3") + " | " + board.get("C3") + " | " + board.get("D3") + " | " + board.get("E3") + " | " + board.get("F3") + " | " + board.get("G3") + " | " + board.get("H3"));
		System.out.println(2 + "   " + board.get("A2") + " | " + board.get("B2") + " | " + board.get("C2") + " | " + board.get("D2") + " | " + board.get("E2") + " | " + board.get("F2") + " | " + board.get("G2") + " | " + board.get("H2"));
		System.out.println(1 + "   " + board.get("A1") + " | " + board.get("B1") + " | " + board.get("C1") + " | " + board.get("D1") + " | " + board.get("E1") + " | " + board.get("F1") + " | " + board.get("G1") + " | " + board.get("H1") + "\n");
		System.out.println("    a  | b  | c  | d  | e  | f  | g  | h  \n");
	}
	
	public void revDraw() {
		System.out.println(8 + "   " + board.get("H1") + " | " + board.get("G1") + " | " + board.get("F1") + " | " + board.get("E1") + " | " + board.get("D1") + " | " + board.get("C1") + " | " + board.get("B1") + " | " + board.get("A1"));
		System.out.println(7 + "   " + board.get("H2") + " | " + board.get("G2") + " | " + board.get("F2") + " | " + board.get("E2") + " | " + board.get("D2") + " | " + board.get("C2") + " | " + board.get("B2") + " | " + board.get("A2"));
		System.out.println(6 + "   " + board.get("H3") + " | " + board.get("G3") + " | " + board.get("F3") + " | " + board.get("E3") + " | " + board.get("D3") + " | " + board.get("C3") + " | " + board.get("B3") + " | " + board.get("A3"));
		System.out.println(5 + "   " + board.get("H4") + " | " + board.get("G4") + " | " + board.get("F4") + " | " + board.get("E4") + " | " + board.get("D4") + " | " + board.get("C4") + " | " + board.get("B4") + " | " + board.get("A4"));
		System.out.println(4 + "   " + board.get("H5") + " | " + board.get("G5") + " | " + board.get("F5") + " | " + board.get("E5") + " | " + board.get("D5") + " | " + board.get("C5") + " | " + board.get("B5") + " | " + board.get("A5"));
		System.out.println(3 + "   " + board.get("H6") + " | " + board.get("G6") + " | " + board.get("F6") + " | " + board.get("E6") + " | " + board.get("D6") + " | " + board.get("C6") + " | " + board.get("B6") + " | " + board.get("A6"));
		System.out.println(2 + "   " + board.get("H7") + " | " + board.get("G7") + " | " + board.get("F7") + " | " + board.get("E7") + " | " + board.get("D7") + " | " + board.get("C7") + " | " + board.get("B7") + " | " + board.get("A7"));
		System.out.println(1 + "   " + board.get("H8") + " | " + board.get("G8") + " | " + board.get("F8") + " | " + board.get("E8") + " | " + board.get("D8") + " | " + board.get("C8") + " | " + board.get("B8") + " | " + board.get("A8") + "\n");
		System.out.println("    a  | b  | c  | d  | e  | f  | g  | h  \n");
	}
	
	public ChessPiece get(String position) {
		return board.get(position);
	}
	
	public void put(String position, ChessPiece piece) {
		board.put(position, piece);
	}
	
 	public String getPosition(int id) {
		for(String position: board.keySet()) {
			if (get(position).getId() == id) {
				return position;
			}
		}
		return null;
	}
	
	public char getColor(int id) {
		for(ChessPiece piece: board.values()) {
			if (piece.getId() == id) {
				return piece.getColor();
			}
		}
		return 0;
	}
	
	public void pawnPromotion(int id, String choice){
		
		String position = getPosition(id);
		
		char color = getColor(id);
		
		switch(choice) {
			case "Rook":
				put(position, new RookPiece(color, id));
				break;
				
			case "Bishop":
				put(position, new BishopPiece(color, id));
				break;
				
			case "Horse":
				put(position, new HorsePiece(color, id));
				break;
			
			default:
				put(position, new QueenPiece(color, id));
				break;
		}
	}	
	
	public void swap(String position1, String position2){
		ChessPiece temp = get(position2);
		put(position2, get(position1));
		put(position1, temp);
	}
	
	public void capture(String piece, String target) {
		int id = get(target).getId();
		put(target ,get(piece));
		put(piece, new EmptyPiece(id));
	}
	
	//
	public boolean isMoveInvalid(char player, Move move) {
		
		try {
			
			if(get(move.getPiece()).getColor() != player) return true;
			
			// simulate future movement to check if move is invalid if it causes a self-check (opens a check)
			ChessPiece temp = get(move.getTarget());
			capture(move.getPiece(), move.getTarget());
			
			// if mover gets checked - note: parameter is attacker's color
			if (isCheck(Miscellanous.colorFlip(player))) {
				put(move.getPiece(), temp);
				swap(move.getPiece(), move.getTarget());
				System.out.println("Move will put you in check.");
				return true;
			}
			
		}catch(Exception e) {
			return true;
			}
		
		return false;
		
	}
	
	public boolean isCheckmate(char player) {
		
		if(isCheck(player)) {
			System.out.println(Miscellanous.colorFlip(player) + " is in check");
			
//			ChessPiece oppKingPiece = Miscellanous.colorFlip(player) == 'W' ? get(getPosition(5)) : get(getPosition(61));
			
//			if(oppKingPiece.getPossibleMoves(this).length == 0) {
//				return true;
//			}
			
			// TODO make a system where we test every possibleMove the opposite team has of getting the king out of check, return false if move exists
			for (ChessPiece piece: board.values()) {
				if(piece.getColor() == Miscellanous.colorFlip(player)) {
					
					String[] possibleMoves = piece.getPossibleMoves(this);
					
					for (String possibleMove: possibleMoves) {
						Move move = new Move(getPosition(piece.getId()), possibleMove);
					
						if (!isMoveInvalid(Miscellanous.colorFlip(player), move)) {
							return false;
						}
					}
				}
			}
			return true;
		}
		
		return false;
	}
	
	public boolean isStalemate(char player) {
		
		char targetColor = Miscellanous.colorFlip(player);
		
		for(ChessPiece piece: board.values()) {
		
			if(piece.getColor() == targetColor) {
				if (piece.getPossibleMoves(this).length != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	// Parameter is attacker's color, as in Is player checking enemy
	public boolean isCheck(char player) {
		
		String oppKingPosition = Miscellanous.colorFlip(player) == 'W' ? getPosition(5) : getPosition(61);
		
		
		for(ChessPiece piece: board.values()) {
			System.out.println(piece.toString() + '-' + getPosition(piece.getId()) + '-' + piece.getColor());
			if(piece.getColor() == player) {
				
				System.out.println("Getting " + piece + "'s possible moves...");
				String[] possibleMoves = piece.getPossibleMoves(this);
				
				
				helper.Miscellanous.printArray(possibleMoves);
				
				if(isKingInCheck(oppKingPosition, possibleMoves)){
					
					return true;					
				}
				
				System.out.println(piece + " not checking opposite king");
			}
		}
		
		return false;
	}
	
	
	boolean isKingInCheck(String oppKingPosition, String[] possibleMoves) {
		
		return Arrays.asList(possibleMoves).indexOf(oppKingPosition) != -1;
		
	}
	
	public void computerMove() {
		
	}
}
