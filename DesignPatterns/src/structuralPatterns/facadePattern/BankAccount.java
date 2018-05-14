package structuralPatterns.facadePattern;

public interface BankAccount {
	void deposit(int amount);
	void withdraw(int amount);
	void transfer(int amount);
}
