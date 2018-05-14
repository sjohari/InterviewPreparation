package chess;

public class Queen extends Piece{

	public Boolean validateMove(String board[][], int startCell, int endCell){
		int endRow = endCell/10;
		int endColumn = endCell%10;
		int startRow = startCell/10;
		int startColumn = startCell%10;
		
		if((endColumn - startColumn) == (endRow - startRow)
				|| (endColumn + startColumn) == (endRow + startRow)
				|| (startColumn == endColumn  || startRow == endRow)){
			
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
