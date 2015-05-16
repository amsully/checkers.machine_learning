package game.info;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testOfficialBoard()
	{
		Board testBoard = new Board();
		
		assert( testBoard.boardLayout[0][0] == "black");
		
		assert( testBoard.boardLayout[7][7] == "red");
	}
	
}
