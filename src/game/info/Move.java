package game.info;

import java.util.ArrayList;

public class Move {
	
	private int[] start = null;
	private int[] end = null;
	private ArrayList<int[]> piecesToRemove = new ArrayList<int[]>();
	
	public Move()
	{
	}
	
	public void addPieceToRemove( int[] pieceToRemove)
	{
		piecesToRemove.add(pieceToRemove);
	}

	public int[] getStart() {
		return start;
	}

	public void setStart(int[] start) {
		this.start = start;
	}

	public int[] getEnd() {
		return end;
	}

	public void setEnd(int[] end) {
		this.end = end;
	}

	public ArrayList<int[]> getPiecesToRemove() {
		return piecesToRemove;
	}

	public void setPiecesToRemove(ArrayList<int[]> remove) {
		this.piecesToRemove = remove;
	}
}
