package game.info;

import util.PrettyPrinter;
import util.Printer;

public class Board {

	// Initial Board. this is why comprehensions/closures are cool in python/groovy
//	Piece[][] boardLayout = new Piece[][]{
//			{new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black")},
//			{new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece("")},
//			{new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black"),new Piece(""),new Piece("black")},
//			{new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece("")},
//			{new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece(""),new Piece("")},
//			{new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece("")},
//			{new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red")},
//			{new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece(""),new Piece("red"),new Piece("")}
//	};	
	
	String[][] boardLayout = new String[][]{
			{"","black","","black","","black","","black"},
			{"black","","black","","black","","black",""},
			{"","black","","black","","black","","black"},
			{"","","","","","","",""},
			{"","","","","","","",""},
			{"red","","red","","red","","red",""},
			{"","red","","red","","red","","red"},
			{"red","","red","","red","","red",""}
	};
	
	
	// Create the initial board.
	public Board()
	{
		String[][] boardLayout = this.boardLayout;

	}


	public String[][] getBoardLayout() {
		return boardLayout;
	}


	public void setBoardLayout(String[][] boardLayout) {
		this.boardLayout = boardLayout;
	}


	public void printBoard() {
		System.out.println(PrettyPrinter.print(this.getBoardLayout(), new Printer<String>() {
	        @Override
	        public String print(String obj) {
	            return obj;
	        }
	    }));
	}
	
}
