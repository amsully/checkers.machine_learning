package play;

import java.util.Scanner;

import competitors.HumanPlayer;
import competitors.Player;
import game.info.Board;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game checkers = new Game();
		
		while( ! checkers.gameOver() )
		{
			checkers.move();
		}
		
		checkers.winner();
	}

}
