package game.info;

import util.PrettyPrinter;
import util.Printer;

public class Board {

	// Initial Board. this is why comprehensions/closures are cool in python/groovy
	Piece[][] boardLayout = new Piece[][]{
			{new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black")},
			{new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece("")},
			{new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black")},
			{new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece("")},
			{new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece("")},
			{new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece("")},
			{new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red")},
			{new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece("")}
	};	
	
	
	// Create the initial board.
	public Board()
	{
		Piece[][] boardLayout = this.boardLayout;

	}


	public Piece[][] getBoardLayout() {
		return boardLayout;
	}


	public void setBoardLayout(Piece[][] boardLayout) {
		this.boardLayout = boardLayout;
	}


	public void printBoard() {
		System.out.println(PrettyPrinter.print(this.getBoardLayout(), new Printer<Piece>() {
	        @Override
	        public String print(Piece obj) {
	            return obj.getColor();
	        }
	    }));
	}
	
}
