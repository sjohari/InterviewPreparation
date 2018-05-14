package chess;

public class Horse extends Piece{

	public Boolean validateMove(String board[][], int startCell, int endCell){
		int endRow = endCell/10;
		int endColumn = endCell%10;
		int startRow = startCell/10;
		int startColumn = startCell%10;
		if((startCell + 21)  == endCell
				|| (startCell - 21)  == endCell
				|| (startCell + 19)  == endCell
				|| (startCell - 19)  == endCell
				|| (startCell + 12)  == endCell
				|| (startCell - 12)  == endCell
				|| (startCell + 8)  == endCell
				|| (startCell - 8)  == endCell){
			
			if(board[endRow][endColumn] == "--")
				return true;
			
			if(board[endRow][endColumn].toString().charAt(0) == 'W' && pieceColor.equals(PieceColor.White)
					|| board[endRow][endColumn].toString().charAt(0) == 'B' && pieceColor.equals(PieceColor.Black))
				return false;
			else{
				return true;
			}
		}
		return false;	
	}
}
