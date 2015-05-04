package play;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;


import competitors.Player;
import game.info.Board;
import game.info.Move;
import game.info.Piece;

public class Game {
	
	private Player playerToMove;
	private Player playerBlack;
	private Player playerRed;
	
	public Game(Player player, Player player2)
	{
		playerBlack = player;
		playerRed = player2;
		
		playerToMove = playerBlack; // The first player is BLACK. (Black moves first)
	}
	
	public boolean gameOver( Board board )
	{
		return true;
	}
	
	public Player getPlayerToMove()
	{
		Player temp = playerToMove;
		
		if( playerToMove == playerBlack )
		{
			playerToMove = playerRed;
		}
		else
		{
			playerToMove = playerBlack;
		}
		
		return temp;
	}

	public Board playMove(Move chosenMove, Board gameBoard) {

		Map<int[], List<int[]>> potentialMoves = getAllowedMoves( chosenMove.getStartPosition() , gameBoard);		
		
		// If a key is the chosen moves end position, execute that key.
		for(int[] key: potentialMoves.keySet() )
		{
			System.out.println( Arrays.toString(key) );
			
			if( Arrays.equals( key, chosenMove.getEndPosition() ) )
			{
				return executeMove( gameBoard, chosenMove, potentialMoves.get(key));
			}
		}
		System.out.println("Invalid Move! Try Again");
			
		return gameBoard;
	}
	
	public Map<int[], List<int[]> > getAllowedMoves( int[] startPiece, Board gameBoard )
	{
		// TODO Auto-generated method stub
		
		Player playerToMove = getPlayerToMove();
		Map<int[], List<int[]>> potentialMoves = null;
			
		// Map of potential moves (end position:list of pieces to remove.)
		if( playerToMove == playerRed)
		{
			 potentialMoves = getRedMoves(startPiece, gameBoard);			
		}
		if( playerToMove == playerBlack)
		{
			potentialMoves =  getBlackMoves(startPiece, gameBoard);			
		}
		
		return potentialMoves;
		
	}

	private Board executeMove( Board gameBoard, Move chosenMove, List<int[]> list) {
		
		Piece[][] newLayout = gameBoard.getBoardLayout();
		int[] start = chosenMove.getStartPosition();
		int[] end = chosenMove.getEndPosition();
		
		
		Piece movingPiece = newLayout[start[0]][start[1]];
		

		
		newLayout[end[0]][end[1]] = movingPiece;
		
		newLayout[start[0]][start[1]] = new Piece("");
		
		for( int[] remove : list )
		{
			newLayout[remove[0]][remove[1]] = new Piece("");
		}
		
		gameBoard.setBoardLayout(newLayout);
	
		return gameBoard;
	}

	private Map<int[], List<int[]>> getRedMoves(int[] startPiece, Board gameBoard) {
		// TODO Auto-generated method stub
		
		Map<int[], List<int[]>> possibleMoves = new HashMap<int[],List<int[]>>();
		List<int[]> removeList = new ArrayList<int[]>();

		
		int[] start = startPiece;
		
		Piece[][] boardLayout = gameBoard.getBoardLayout();

		int[] end = { start[0] - 1, start[1] +1}; // Right Diagonal location of a potential piece.

		
		if( boardLayout[ end[0]][ end[1] ].getColor() == "") 
		{
			// Here is where the recurrence will begin to move pieces.
			
			possibleMoves.put(end, removeList);
		}

		
		return possibleMoves;
	}
	
	private Map<int[], List<int[]>> getBlackMoves(int[] startPiece, Board gameBoard) {
		// TODO Auto-generated method stub
		
		Map<int[], List<int[]>> possibleMoves = new HashMap<int[],List<int[]>>();
		List<int[]> removeList = new ArrayList<int[]>();

		
		int[] start = startPiece;
		
		Piece[][] boardLayout = gameBoard.getBoardLayout();

		int[] end = { start[0] + 1, start[1] -1}; // Diagonal left location of a potential piece.

		
		if( boardLayout[ end[0]][ end[1] ].getColor() == "") 
		{
			// Here is where the recurrence will begin to move pieces.
			
			possibleMoves.put(end, removeList);
		}

		
		return possibleMoves;
	}

}
