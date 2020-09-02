package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{

	private ChessMatch chessMatch;
	
	public Pawn(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
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
			
			// specialmove en passant white:
			if (position.getRow() == 3) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() - 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() - 1][right.getColumn()] = true;
				}
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
			
			// specialmove en passant white:
			if (position.getRow() == 4) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() + 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() + 1][right.getColumn()] = true;
				}
			}
		}
		
		return mat;
	}

	
}
