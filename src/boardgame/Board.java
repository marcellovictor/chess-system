package boardgame;

public class Board {

	//ATRIBUTOS:
	
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	//CONSTRUTORES:
	
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	//GETTERS E SETTERS:
	
	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	
	
	
}
