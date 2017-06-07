package sheet12Arrays;

import java.util.Arrays;

public class Customer {
	private String name;
	private String address;
	private String phone;
	private Pizza [] pizzas;
	double totalCost;//total cost of all pizzas

	public Customer(){

	}
	public Customer(String name, String address, String phone, Pizza[] pizzas){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.pizzas=pizzas;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Pizza[] getPizzas() {
		return pizzas;
	}
	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getTotalCost(){
		//	for(int i=0; i<pizzas.length; i++)
		//	System.out.println(pizzas[i].calculatePrice());
		 double cost = 0;
         
	        for (Pizza one : pizzas) {
	            cost += one.calculatePrice();
	        }
	         
	        return cost;
		
	}
	@Override
	public String toString() {
		return "Customer name: " + name + 
				"\naddress: " + address + 
				"\nphone: " + phone + 
				"\npizzas: "+ Arrays.toString(pizzas) + 
				"\nTotal Cost: " + getTotalCost();
	}


}
