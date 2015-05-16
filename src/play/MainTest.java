package play;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void initGameBoardTest() {
		Game testGame = new Game();
		
		assert( testGame.gameOver() == false);
	}

}
