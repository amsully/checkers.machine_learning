package competitors;

import java.util.Scanner;

import game.info.Board;
import game.info.Move;

public class HumanPlayer extends Player{
	
	public HumanPlayer()
	{
		super();
	}
	
	public Move chooseMove( Board gameBoard, Scanner scan )
	{
		
		
	
		System.out.println("Row of current piece: ");
		int rowStart = scan.nextInt();
		
		System.out.println("Column of current piece: ");
		int colStart = scan.nextInt();

		System.out.println("Row of current location to move: ");
		int rowEnd = scan.nextInt();

		System.out.println("Column of current location to move: ");
		int colEnd = scan.nextInt();

		int[] startPosition = {rowStart, colStart};
		int[] endPosition = {rowEnd, colEnd};
		
		return new Move(startPosition,endPosition);
		
	}

}
