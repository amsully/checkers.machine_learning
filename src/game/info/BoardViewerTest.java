package game.info;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.apache.commons.lang.ArrayUtils;

public class BoardViewerTest {

	@Test
	public void testGetNumberOfPieces()
	{
		BoardViewer boardViewer = new BoardViewer( new Board() );
		
		assertTrue("Number of Red", boardViewer.getNumberOf("red") == 12);
		assertTrue( "Number of Black", boardViewer.getNumberOf("black") == 12);
		
	}

	@Test
	public void testMovesSimple()
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
		
		
		Move redMove1 = new Move();
		int[] start = {7,0};
		int[] end = {6,1};
		redMove1.setStart(start);
		redMove1.setEnd(end);
		
		Move blackMove1 = new Move();
		
		ArrayList<Move> boardViewerRedMoves = boardViewer.getMovesOf("red");
		
		// Testing that the only move returns has the same start and end.
		assertTrue( "Wrong Red Moves", ArrayUtils.isEquals(boardViewerRedMoves.get(0).getStart(), redMove1.getStart()));
		assertTrue( "Wrong Red Moves", ArrayUtils.isEquals(boardViewerRedMoves.get(0).getEnd(), redMove1.getEnd()));

	}
	
	@Test
	public void testMoveAndRedCapture()
	{
		String[][] simpleBoard = 
			{
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","black","","","","","",""},
				{"red","","","","","","",""}
				
			};
		
		Board simpleBoardLayout = new Board();
		
		simpleBoardLayout.setBoardLayout(simpleBoard);
		
		BoardViewer boardViewer = new BoardViewer( simpleBoardLayout );
		
		int[][] redMoves = {{7,0,5,3}};
		int[][] blackMoves = {{6,1,7,2}};		
		
		assertTrue( "DEPRECATED TEST - Wrong Red Moves", ArrayUtils.isEquals( boardViewer.getMovesOf("red"), redMoves) );
		assertTrue( "DEPRECATED TEST - Wrong Black Moves", ArrayUtils.isEquals( boardViewer.getMovesOf("black"), blackMoves) );

	}
	
	@Test
	public void testMoveAndRedDoubleCapture()
	{
		String[][] simpleBoard = 
			{
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","black","","","",""},
				{"","","","","","","",""},
				{"","black","","","","","",""},
				{"red","","","","","","",""}
				
			};
		
		Board simpleBoardLayout = new Board();
		
		simpleBoardLayout.setBoardLayout(simpleBoard);
		
		BoardViewer boardViewer = new BoardViewer( simpleBoardLayout );
		
		int[][] redMoves = {{7,0,3,5}};
		int[][] blackMoves = {{6,1,7,2},{4,4,5,3}, {4,4,5,5}};		
		
		assertTrue( "DEPRECATED TEST - Wrong Red Moves", ArrayUtils.isEquals( boardViewer.getMovesOf("red"), redMoves) );
		assertTrue( "DEPRECATED TEST - Wrong Black Moves", ArrayUtils.isEquals( boardViewer.getMovesOf("black"), blackMoves) );

	}

	@Test
	public void testMoveAndBlackDoubleCapture() 
	{
		String[][] simpleBoard = 
			{
				{"","black","","","","","",""},
				{"","","red","","","","",""},
				{"","","","","","","",""},
				{"","","","","red","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""},
				{"","","","","","","",""}
				
			};
		
		Board simpleBoardLayout = new Board();
		
		simpleBoardLayout.setBoardLayout(simpleBoard);
		
		BoardViewer boardViewer = new BoardViewer( simpleBoardLayout );
		
		ArrayList<int[]> redMoves = new ArrayList<int[]>();
		
		int[] redMove1 = {1,2,0,3};
		int[] redMove2 = {3,4,2,2};
		int[] redMove3 = {3,4,2,5};
		
		redMoves.add(redMove1);
		redMoves.add(redMove2);
		redMoves.add(redMove3);
		
//		int[][] redMoves = {{1,2,0,3}, {3,4,2,2}, {3,4,2,5}};
		int[][] blackMoves = {{6,2,7,3},{4,5,5,4}, {4,5,5,6}};		
		
		assertTrue( "DEPRECATED - Wrong Red Moves", ArrayUtils.isEquals( boardViewer.getMovesOf("red"), redMoves) );
		assertTrue( "DEPRECATED - Wrong Black Moves", ArrayUtils.isEquals( boardViewer.getMovesOf("black"), blackMoves) );

	}

}
