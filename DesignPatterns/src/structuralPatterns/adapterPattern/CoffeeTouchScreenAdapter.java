package structuralPatterns.adapterPattern;

public class CoffeeTouchScreenAdapter implements CoffeeTouchScreenAdapterInterface {
	private OldCoffeeMachine oldCoffeeMachine = null;

	public void setOldCoffeeMachine(OldCoffeeMachine oldCoffeeMachine) {
		this.oldCoffeeMachine = oldCoffeeMachine;
	}

	public void makeCoffeeInOldMachine(Coffee coffee){
		
		oldCoffeeMachine.makeCoffee(coffee.sugar, coffee.coffee, coffee.water);
	}
}
