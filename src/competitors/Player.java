package competitors;

import java.util.Scanner;

import play.Game;
import game.info.Board;
import game.info.Move;

public abstract class Player {
	
	public Player()
	{
	}
	
	public abstract Move chooseMove( Game checkers, Board gameBoard );
}
