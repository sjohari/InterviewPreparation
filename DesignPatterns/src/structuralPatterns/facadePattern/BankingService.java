package structuralPatterns.facadePattern;

public class BankingService {
	
	BankAccount account = null;
	public void createNewAccount(String accountType, int amount){

		switch(accountType){
			case "savings":
				account = new SavingsAccount(amount);
				break;
			case "investment":
				account = new InvestmentAccount(amount);
				break;
			default:
				System.out.println("Invalid option");
				break;
		}
		
		if(account != null){
			System.out.println("You have successfully created " + accountType + " account");
		}
	}
	
	public void addMoney(int amount){
		account.deposit(amount);
		System.out.println(amount + " successfully deposited");
	}
}
