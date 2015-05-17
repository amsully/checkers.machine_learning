package play;

import static org.junit.Assert.*;

import org.junit.Test;

import competitors.Player;

public class GameTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGameNotOver()
	{
		Game testGame = new Game();
		assert( testGame.gameOver() == false);
	}
	
	@Test
	public void testGameMoveAlternations() {
		
		Game testGame = new Game();
		
		assert( testGame.getPlayerToMove() == "black" );
		
		int[] startPosition = {2,0};
		int[] endPosition = {3,0};
		
		testGame.move(startPosition, endPosition );
		
		assert( testGame.getPlayerToMove() == "red");
	
	}
	
	@Test
	public void testGameWithWinner()
	{
		Game testGame = new Game();
		
		testGame.setCheckersBoard( redWins );
		
		assert( testGame.gameOver() == true );
		
	}
}
