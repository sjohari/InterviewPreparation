package blackjackGame;

public enum Suit {
	Spade (0),
	Diamond (1),
	Hearts (2),
	Club (3);
	
	private final int value;
	
	Suit(int v){
		value = v;
	}
	
	public int getValue(){
		return value;
	}
}
