package chess;

public abstract class Piece {
	PieceType pieceType;
	PieceColor pieceColor;
	abstract Boolean validateMove(String[][] board, int startCell, int endCell);
}
