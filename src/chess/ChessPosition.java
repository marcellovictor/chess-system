package chess;

import boardgame.Position;

public class ChessPosition {

	//ATRIBUTOS:
	
	private char column;
	private int row;
	
	//CONSTRUTORES:
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	//GETTERS E SETTERS:
	
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	//MÉTODOS:
	
	protected Position toPosition() {
		return new Position((8 - row), column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position pos) {
		return new ChessPosition((char) (pos.getColumn() + 'a'), (8 - pos.getRow()));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(column + row);
		return sb.toString();
	}
}
