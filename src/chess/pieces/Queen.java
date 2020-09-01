package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece{

	public Queen(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position auxp = new Position(0, 0);
		
		//up:
		
		auxp.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
			auxp.setRow(auxp.getRow() - 1);
		}
		if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
		}
		
		//down:
		
		auxp.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
			auxp.setRow(auxp.getRow() + 1);
		}
		if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
		}
		
		//right:
		
		auxp.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
			auxp.setColumn(auxp.getColumn() + 1);
		}
		if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
		}
		
		//left:
		
		auxp.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
			auxp.setColumn(auxp.getColumn() - 1);
		}
		if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
		}
		
		//nw:
		
		auxp.setValues(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
			auxp.setValues(auxp.getRow() - 1, auxp.getColumn()-1);
		}
		if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
		}
		
		//ne:
		
		auxp.setValues(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
			auxp.setValues(auxp.getRow() - 1, auxp.getColumn() + 1);
		}
		if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
		}
		
		//sw:
		
		auxp.setValues(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
			auxp.setValues(auxp.getRow() + 1, auxp.getColumn() - 1);
		}
		if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
		}
		
		//se:
		
		auxp.setValues(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
			auxp.setValues(auxp.getRow() + 1, auxp.getColumn() + 1);
		}
		if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
			mat[auxp.getRow()][auxp.getColumn()] = true;
		}
		
		return mat;
	}

}
