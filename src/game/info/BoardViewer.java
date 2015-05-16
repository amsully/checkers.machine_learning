package game.info;

public class BoardViewer {
	
	private Board checkersBoard;
	private String[][] boardLayout;
	
	public BoardViewer( Board checkersBoard )
	{
		this.checkersBoard = checkersBoard;
		this.boardLayout = checkersBoard.getBoardLayout();
	}
	
	public int getNumberOf(String coloredPieces)
	{
		int count = 0;
		
		for(String[] rowOfBoard : boardLayout)
		{
			for(String pieceLocation: rowOfBoard)
			{
				if( pieceLocation.equals(coloredPieces) )
				{
					count++;
				}
			}
		}
		
		return count;
	}

	public int[][] getMovesOf( String colorOfPieces)
	{
		
		return null;
	}
}
