package behaviouralPatterns.StatePattern;

public class Idle implements State{

	@Override
	public void insertMoney(VendingMachine vendingMachine) {
		System.out.println("Money inserted");
		vendingMachine.setCurrentState(vendingMachine.getHasOneDollar());
		
	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine) {
		System.out.println("insert money first");
		
	}

	@Override
	public void refundMoney(VendingMachine vendingMachine) {
		System.out.println("Money not available to refund");
		
	}

}
