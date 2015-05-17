package game.info;

import java.util.ArrayList;
import java.util.Collection;

public class BoardViewer {

	private Board checkersBoard;

	public BoardViewer(Board checkersBoard) {
		this.checkersBoard = checkersBoard;
	}

	public int getNumberOf(String coloredPieces) {
		int count = 0;

		for (String[] rowOfBoard : checkersBoard.boardLayout) {
			for (String pieceLocation : rowOfBoard) {
				if (pieceLocation.equals(coloredPieces)) {
					count++;
				}
			}
		}

		return count;
	}

	// Gets either black or red moves.
	public ArrayList<Move> getMovesOf(String colorOfPieces) {
		try {

			if (colorOfPieces == "black") {
				return allBlackMoves();
			} else if (colorOfPieces == "red") {
				return allRedMoves();
			}

			throw new Exception();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return new ArrayList<Move>(); // Prevent errors.

	}

	private ArrayList<Move> allRedMoves() {

		ArrayList<int[]> locations = getPieceLocations("red");

		ArrayList<Move> moves = new ArrayList<Move>();

		for (int[] location : locations) {
			moves.addAll(checkersMoves(1, location));
		}

		return moves;

	}

	private ArrayList<Move> allBlackMoves() {
		// TODO Auto-generated method stub
		ArrayList<int[]> locations = getPieceLocations("black");

		ArrayList<Move> moves = new ArrayList<Move>();

		for (int[] location : locations) {
			moves.addAll(checkersMoves(-1, location));
		}

		return moves;
	}

	private ArrayList<int[]> getPieceLocations(String pieceColor) {
		// TODO Auto-generated method stub

		ArrayList<int[]> locationsOfPieces = new ArrayList<int[]>();

		for (int row = 0; row < checkersBoard.boardLayout.length; row++) {
			for (int col = 0; col < checkersBoard.boardLayout[row].length; col++) {
				if (checkersBoard.boardLayout[row][col].equals(pieceColor)) {
					int[] newLocation = { row, col };
					locationsOfPieces.add(newLocation);
				}
			}
		}

		return locationsOfPieces;
	}

	private Collection<Move> checkersMoves(int rowIncrement, int[] location) {
		// TODO Auto-generated method stub
		
		String locationColor = checkersBoard.boardLayout[location[0]][location[1]];
		
		Move negativeColMove = new Move(); // decrement column by -1
		Move positiveColMove = new Move(); // increment column by 1
		
		
		
		return null;
		
		
	}
}
