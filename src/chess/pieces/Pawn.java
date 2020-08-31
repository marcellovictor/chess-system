package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "P";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position auxp = new Position(0, 0);
		
		if (getColor() == Color.WHITE) {
			
			//front 1
			auxp.setValues(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
				mat[auxp.getRow()][auxp.getColumn()] = true;
			}
			
			//front 2
			auxp.setValues(position.getRow() - 2, position.getColumn());
			Position auxp2 = new Position(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp) && getMoveCount() == 0 && !getBoard().thereIsAPiece(auxp2)) {
				mat[auxp.getRow()][auxp.getColumn()] = true;
			}
			
			//diagonal 1
			auxp.setValues(position.getRow() - 1, position.getColumn() - 1);
			if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
				mat[auxp.getRow()][auxp.getColumn()] = true;
			}
			
			//diagonal 2
			auxp.setValues(position.getRow() - 1, position.getColumn() + 1);
			if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
				mat[auxp.getRow()][auxp.getColumn()] = true;
			}
		}
		else {
			
			//front 1
			auxp.setValues(position.getRow() + 1, position.getColumn());
			if (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp)) {
				mat[auxp.getRow()][auxp.getColumn()] = true;
			}
			
			//front 2
			auxp.setValues(position.getRow() + 2, position.getColumn());
			Position auxp2 = new Position(position.getRow() + 1, position.getColumn());
			if (getBoard().positionExists(auxp) && !getBoard().thereIsAPiece(auxp) && getMoveCount() == 0 && !getBoard().thereIsAPiece(auxp2)) {
				mat[auxp.getRow()][auxp.getColumn()] = true;
			}
			
			//diagonal 1
			auxp.setValues(position.getRow() + 1, position.getColumn() - 1);
			if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
				mat[auxp.getRow()][auxp.getColumn()] = true;
			}
			
			//diagonal 2
			auxp.setValues(position.getRow() + 1, position.getColumn() + 1);
			if (getBoard().positionExists(auxp) && isThereOpponentPiece(auxp)) {
				mat[auxp.getRow()][auxp.getColumn()] = true;
			}
		}
		
		return mat;
	}

	
}
