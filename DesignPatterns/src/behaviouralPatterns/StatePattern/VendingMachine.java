package behaviouralPatterns.StatePattern;

public class VendingMachine {
	
	private State currentState;
	private State idle;
	private State hasOneDollar;
	private State outOfStock;
	private int count;
	
	public VendingMachine(int count){
		idle = new Idle();
		hasOneDollar = new HasOneDollar();
		outOfStock = new OutOfStock();
		this.setCount(count);
		if(count > 0){
			this.setCurrentState(idle);
		}else{
			this.setCurrentState(outOfStock);
		}
	}
	
	public State getIdle() {
		return idle;
	}

	public State getHasOneDollar() {
		return hasOneDollar;
	}

	public State getOutOfStock() {
		return outOfStock;
	}
	
	public void insertMoney() {
		currentState.insertMoney(this);

	}

	public void dispenseProduct() {
		currentState.dispenseProduct(this);

	}

	public void refundMoney() {
		currentState.refundMoney(this);

	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
