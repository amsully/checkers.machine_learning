package play;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import competitors.HumanPlayer;
import competitors.Player;
import game.info.Board;
import game.info.BoardController;
import game.info.Move;

public class Game {
	
	private Player playerToMove;
	private Player playerBlack;
	private Player playerRed;
	
	private Board checkersBoard;
	
	public Game()
	{
		playerBlack = new HumanPlayer();
		playerRed = new HumanPlayer();
		
		playerToMove = playerBlack; // The first player is BLACK. (Black moves first)
		
		checkersBoard = new Board();
	}
	
	public boolean gameOver()
	{
		if( checkersBoard.noPieces("black") )
		{
			return true;
		}
		else if( checkersBoard.noPieces("red") )
		{
			return true;
		}
		
		return false;
		
	}
	
	public void move()
	{	
		
		// Move to be played
		Move move = playerToMove.chooseMove(this, checkersBoard);
		
		// Update board with new move
		BoardController boardController = new BoardController( checkersBoard );
		boardController.updateBoard(move);
		
		checkersBoard.printBoard();
		
	}

	public Player getPlayerBlack() {
		return playerBlack;
	}

	public void setPlayerBlack(Player playerBlack) {
		this.playerBlack = playerBlack;
	}

	public Player getPlayerRed() {
		return playerRed;
	}

	public void setPlayerRed(Player playerRed) {
		this.playerRed = playerRed;
	}

	public Board getCheckersBoard() {
		return checkersBoard;
	}

	public void setCheckersBoard(Board checkersBoard) {
		this.checkersBoard = checkersBoard;
	}

	public void setPlayerToMove(Player playerToMove) {
		this.playerToMove = playerToMove;
	}

	public void winner() {
		// TODO Auto-generated method stub
		
	}

}
