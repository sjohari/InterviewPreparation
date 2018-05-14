package behaviouralPatterns.StatePattern;

public class UseVendingMachine {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine(10);
		vendingMachine.insertMoney();
		vendingMachine.dispenseProduct();

	}

}
