package boardgame;

public class Piece {

	//ATRIBUTOS:
	
	protected Position position;
	private Board board;
	
	//CONSTRUTORES:
	
	public Piece(Board board) {
		this.board = board;
	}

	//GETTERS E SETTERS:
	
	protected Board getBoard() {
		return board;
	}

	
	
	
}
