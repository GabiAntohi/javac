package sheet12Arrays;

public class MainForPizza {

	public static void main(String[] args) {
		
     
  Customer c = new Customer("John Malone","45 Kildare St, Dublin 2","087344432",
    		 new Pizza[]{new Pizza (new String[]{"cheese", "bacon"}, PizzaSize.SMALL)});
		System.out.println(c);
		System.out.println("------------------------------");
	    Customer c1 = new Customer("Jane Malone","45 Kildare St, Dublin 2","087344432", 
				 new Pizza[]{new Pizza (new String []{"cheese"}, PizzaSize.LARGE), new Pizza (new String[]{"cheese", "bacon","onion"}, PizzaSize.SMALL)});
			System.out.println(c1);

			System.out.println("------------------------------");
		
	}

}
