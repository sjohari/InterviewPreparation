package structuralPatterns.facadePattern;

public class Customer {
	public static void main(String args[]){
		BankingService bs = new BankingService();
		bs.createNewAccount("savings", 1000);
		
		bs.addMoney(200);
	}
}
