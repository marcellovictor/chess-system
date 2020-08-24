package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{

	//ATRIBUTOS:
	
	private Color color;
	
	//CONSTRUTORES:
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	//GETTERS E SETTERS:
	
	public Color getColor() {
		return color;
	}
}
