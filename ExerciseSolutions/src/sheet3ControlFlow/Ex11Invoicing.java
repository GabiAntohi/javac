package sheet3ControlFlow;
public class Ex11Invoicing{
    public static void main(String [] args){
		Ex11Invoicing ex11 = new Ex11Invoicing();
		double reference=888775;
	    double unitprice=9;
		double quantity=101;
		double total=0;
		double total2=0;
		total=unitprice*quantity;
		ex11.totalCost(reference,unitprice,quantity,total,total2);
	
	}
	public void totalCost(double reference, double unitprice, double quantity, double total,double total2){	
	
		if(quantity>100){
		total=unitprice*100;
		unitprice = unitprice*75/100;
		total2=unitprice*(quantity-100)+total;
		System.out.printf("\n the total is %.2f", total2);}

		else {
		System.out.printf("produce reference no. is %.2f, the unit price is €%.2f, the quantity is %.2f, the total is €%.2f",reference, unitprice, quantity, total);}
		
	}
	}
	