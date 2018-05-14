package blackjackGame;

public abstract class Card {
	
	protected int faceValue;
	protected Suit suit;
	
	private boolean available = true;
	
	public abstract int value();
	
	public Suit getSuit(){
		return suit;
	}
	
	
	public boolean isAvailable(){
		return available;
	}
	
	public void markAvailable(){
		available  = true;
	}
	
	public void markUnAvailable(){
		available  = false;
	}

}
