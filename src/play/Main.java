package play;

import java.util.Scanner;

import competitors.HumanPlayer;
import competitors.Player;
import game.info.Board;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// When closing scanner, it also closes the input stream System.in therefore this is used in main and not
		// closed until the program is finished.
		Scanner scan = new Scanner(System.in);

		// Initialize gameboard
		Board gameBoard = new Board();
		
		// First player is black (black moves first).
		Game checkers = new Game( new HumanPlayer(), new HumanPlayer() );

		// Temporary while building
		int tempCounter  = 0;
		
		// Play game when it is not finished (no more red or black pieces).
		while( ! checkers.gameOver(gameBoard) || tempCounter <= 1 )
		{

		
			// Players turn
			Player playerToMove = checkers.getPlayerToMove();
			
			// Temp gameboard. 
			// If the move entered was invalid then the next turn should not be played and the player should reselect a move.
			Board updatedGameBoard = gameBoard;
			
			// Make sure a valid move was entered. 
			while( gameBoard == updatedGameBoard)
			{
				gameBoard.printBoard();	
				
				updatedGameBoard = checkers.playMove( playerToMove.chooseMove(checkers, gameBoard, scan), gameBoard );
			}
			
			gameBoard = updatedGameBoard;
			
			
			tempCounter += 1;
		}
		
		scan.close();
	}

}
