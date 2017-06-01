package sheet12Arrays;

import java.util.Arrays;

public class Pizza {
	private double cost;
	public PizzaSize pizzaSize;
	String[] toppings={"cheese", "onion", "mushrooms", "pickles", "tomato", "bell pepper", "mince", "bacon", "egg", "rocket"};
	public Pizza(){
	}

	public Pizza(String[] toppings, PizzaSize pizzaSize) {
	    this.toppings = toppings;
		this.pizzaSize = pizzaSize;
		
	}

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	
public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public double calculatePrice(){
		return cost=pizzaSize.getBasePrice()+pizzaSize.getPricePerTopping()*toppings.length;	
	}
	@Override
	public String toString() {
		return 
				"\nPrice of Pizza: " +calculatePrice()+
				"\npizza size: " + pizzaSize + 
				"\nToppings: " + Arrays.toString(toppings);
	}
}