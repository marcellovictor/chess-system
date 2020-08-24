package boardgame;

public abstract class Piece {

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
	
	//M�TODOS:
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

	
	
	
}
