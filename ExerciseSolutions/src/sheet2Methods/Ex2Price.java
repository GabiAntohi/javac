package sheet2Methods;
public class Ex2Price{
    public static void main(String [] args){
    	Ex2Price m = new Ex2Price();
	
		m.calculateTotal(2,3);
		m.calculateTotal1(2.3,5.7);
		m.calculateTotal2(2,7.2);
}

	public void calculateTotal(int price, int quantity){

		int total = price*quantity;
		System.out.println("total:" + total);
	}
	
	public void calculateTotal1(double price, double quantity){
		double total = price*quantity;
		System.out.printf("the total of %f and %f is %f:\n", price, quantity, total);
	}
	
	public void calculateTotal2(int price, double quantity){
		double total = price*quantity;
		System.out.printf("the total of %d and %.2f is %.2f:\n", price, quantity, total);
	}
	
	
	
	}
	