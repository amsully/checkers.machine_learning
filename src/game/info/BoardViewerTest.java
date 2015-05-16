package game.info;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BoardViewerTest {

	@Test
	public void testGetNumberOfPieces()
	{
		BoardViewer boardViewer = new BoardViewer( new Board() );
		
		assert( boardViewer.getNumberOf("red") == 12);
		assert( boardViewer.getNumberOf("black") == 12);
		
	}

	@Test
	public void testGetPossibleMovesOfColor()
	{
		String[][] simpleBoard = 
			{
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"red","","","","","","",""}
				
			};
		
		Board simpleBoardLayout = new Board();
		
		simpleBoardLayout.setBoardLayout(simpleBoard);
		
		BoardViewer boardViewer = new BoardViewer( simpleBoardLayout );
		
		int[][] redMoves = {{7,0,6,1}};
		int[][] blackMoves = {{}};
		
		assert( ArraysUtils.isEquals( boardViewer.getMovesOf("red"), redMoves);
		assert( ArraysUtils.isEquals( boardViewer.getMovesOf("black"), blackMoves);

	}
	
}
