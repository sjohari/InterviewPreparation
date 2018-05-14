package structuralPatterns.adapterPattern;

public class Coffee {
	CoffeeType coffeeType;
	int sugar;
	int coffee;
	int water;
	
	Coffee(CoffeeType coffeeType){
		if(coffeeType.equals(CoffeeType.CAPPACHINO)){
			sugar = 1;
			coffee =1;
			water =1;
			
		}else{
			sugar = 1;
			coffee =2;
			water =1;
		}
		
	}
	
	public CoffeeType getCoffeeType() {
		return coffeeType;
	}
	public void setCoffeeType(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
	}
	
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public int getCoffee() {
		return coffee;
	}
	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
}
