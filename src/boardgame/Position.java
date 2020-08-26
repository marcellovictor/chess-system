package boardgame;

public class Position {

	//ATRIBUTOS:
	
	private Integer row;
	private Integer column;
	
	//CONSTRUTORES:
	
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	//GETTERS E SETTERS:
	
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	//MÉTODOS:
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
}
