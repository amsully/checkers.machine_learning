package competitors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import play.Game;
import game.info.Board;
import game.info.Move;

public class HumanPlayer extends Player{
	
	public HumanPlayer()
	{
		super();
	}
	
	public Move chooseMove( Game checkers, Board gameBoard, Scanner scan )
	{
		int selection = -1;
		
	
		System.out.println("Row of current piece: ");
		int rowStart = scan.nextInt();
		
		System.out.println("Column of current piece: ");
		int colStart = scan.nextInt();
		int[] startPosition = {rowStart, colStart};

		// int[] potential moves = getPotentialMoves
		Map<int[], List<int[]>> potentialMoves =  checkers.getAllowedMoves( startPosition, gameBoard );

		printSelectionChoices( potentialMoves );
		System.out.print("Select integer of desired move: ");

		int selection = scan.nextInt();

		// Print potential moves
		// return potentialMoves[enteredmove]
		
		System.out.println("Row of current location to move: ");
		int rowEnd = scan.nextInt();

		System.out.println("Column of current location to move: ");
		int colEnd = scan.nextInt();

		int[] endPosition = {rowEnd, colEnd};
		
		return new Move(startPosition,endPosition);
		
	}

	private void printSelectionChoices(Map<int[], List<int[]>> potentialMoves) {
		// TODO Auto-generated method stub
		int selectionInteger = 0;
		for( int[] key: potentialMoves.keySet())
		{
			System.out.println( selectionInteger + ".)    " + Arrays.toString(key));
		}
	}

}
