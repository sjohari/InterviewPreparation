package chess;

public class GetPieceFactory {
	
	public Piece getPiece(String pieceType){
		if(pieceType == null)
			return null;
		if(pieceType.equals(PieceType.BH.toString()) || pieceType.equals(PieceType.WH.toString())){
			return new Horse();
		}
		if(pieceType.equals(PieceType.BQ.toString()) || pieceType.equals(PieceType.WQ.toString())){
			return new Queen();
		}
		if(pieceType.equals(PieceType.BP.toString()) || pieceType.equals(PieceType.WP.toString())){
			return new Pawn();
		}
		return null;
	}
}
