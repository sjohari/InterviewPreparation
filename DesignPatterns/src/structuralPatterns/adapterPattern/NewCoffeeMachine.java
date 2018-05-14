package structuralPatterns.adapterPattern;

public class NewCoffeeMachine {
	CoffeeTouchScreenAdapterInterface coffeeTouchScreenAdapterInterface = null;
	
	NewCoffeeMachine(CoffeeTouchScreenAdapter coffeeTouchScreenAdapter){
		coffeeTouchScreenAdapterInterface = coffeeTouchScreenAdapter;
	}
	
	void makeCoffee(CoffeeType coffeeType){
		Coffee coffee =new Coffee(coffeeType);
		coffeeTouchScreenAdapterInterface.makeCoffeeInOldMachine(coffee);
	}
	
}
