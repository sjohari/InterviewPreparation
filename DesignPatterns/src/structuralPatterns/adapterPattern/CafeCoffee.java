package structuralPatterns.adapterPattern;

public class CafeCoffee {
	public static void main(String args[]){
		CoffeeTouchScreenAdapter coffeeTouchScreenAdapter = new CoffeeTouchScreenAdapter();
		coffeeTouchScreenAdapter.setOldCoffeeMachine(new OldCoffeeMachine());
		NewCoffeeMachine newCoffeeMachine = new NewCoffeeMachine(coffeeTouchScreenAdapter);
		newCoffeeMachine.makeCoffee(CoffeeType.CAPPACHINO);
	}
}
