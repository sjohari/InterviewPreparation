package chess;

import java.util.Scanner;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pieceType;
		int startCell;
		int endCell;
		Scanner sc = new Scanner(System.in);
		PlayChess playChess = new PlayChess();
		System.gc();
		while(true){
			System.out.println("Enter you move -->");
			System.out.println("Enter PieceType : ");
			pieceType = sc.nextLine();
			System.out.println("Enter startCell : ");
			startCell = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter endCell : ");
			endCell = Integer.parseInt(sc.nextLine());
			playChess.move(PieceType.valueOf(pieceType), startCell, endCell);
		}
		
		

	}

}
