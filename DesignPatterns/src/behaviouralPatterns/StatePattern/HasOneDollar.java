package behaviouralPatterns.StatePattern;

public class HasOneDollar implements State {

	@Override
	public void insertMoney(VendingMachine vendingMachine) {
		System.out.println("Money  already inserted");

	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine) {
		System.out.println("product dispensed");
		vendingMachine.setCurrentState(vendingMachine.getIdle());

	}

	@Override
	public void refundMoney(VendingMachine vendingMachine) {
		System.out.println("Money refunded");
		vendingMachine.setCurrentState(vendingMachine.getIdle());
	}

}
