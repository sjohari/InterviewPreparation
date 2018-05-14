package behaviouralPatterns.StatePattern;

public interface State {
	public void insertMoney(VendingMachine vendingMachine);
	public void dispenseProduct(VendingMachine vendingMachine);
	public void refundMoney(VendingMachine vendingMachine);
}
