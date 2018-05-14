package behaviouralPatterns.StatePattern;

public class OutOfStock implements State {

	@Override
	public void insertMoney(VendingMachine vendingMachine) {
		System.out.println("Out of Stock");

	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine) {
		System.out.println("Can't Dispense...Out of Stock");

	}

	@Override
	public void refundMoney(VendingMachine vendingMachine) {
		System.out.println("Money not available to refund");

	}

}
