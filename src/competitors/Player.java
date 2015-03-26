package competitors;

import java.util.Scanner;

import game.info.Board;
import game.info.Move;

public abstract class Player {
	
	public Player()
	{
	}
	
	public abstract Move chooseMove( Board gameBoard, Scanner scan );
}
