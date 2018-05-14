package chess;

public class PlayChess {
	public String board[][] = 
		{{"WR","WH","WB","WQ","WK","WB","WH","WR"},
			{"WP","WP","WP","WP","WP","WP","WP","WP"},
			{"--","--","--","--","--","--","--","--"},
			{"--","--","--","--","--","--","--","--"},
			{"--","--","--","--","--","--","--","--"},
			{"--","--","--","--","--","--","--","--"},
			{"BP","BP","BP","BP","BP","BP","BP","BP"},
			{"BR","BH","BB","BQ","BK","BB","BH","BR"}};

	void move(PieceType pieceType , int startCell , int endCell){
		boolean isvalidMove = true;
		if(startCell > 77 || startCell < 0  || endCell > 77 || endCell < 0){
			System.out.println("Invalid Move");
		}
		else{
			GetPieceFactory pieceFactory = new GetPieceFactory();
			Piece piece = pieceFactory.getPiece(pieceType.toString());
			if(pieceType.toString().charAt(0) == 'W'){
				piece.pieceColor = PieceColor.White;
			}else{
				piece.pieceColor = PieceColor.Black;
			}
			piece.pieceType = pieceType;
			isvalidMove = piece.validateMove(board , startCell ,  endCell);
			if(isvalidMove){
				int endRow = endCell/10;
				int endColumn = endCell%10;
				int startRow = startCell/10;
				int startColumn = startCell%10;
				board[endRow][endColumn] = board[startRow][startColumn];
				board[startRow][startColumn] = "--";
				printboard();
			}else{
				System.out.println("Invalid Move");
			}
		}
		
	}

	private void printboard() {
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.print(board[i][j] + " " );
			}
			System.out.println();
		}
		
	}
}
