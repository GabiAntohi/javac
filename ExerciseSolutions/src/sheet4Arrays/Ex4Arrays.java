package sheet4Arrays;
public class Ex4Arrays{
	public static void main(String [] args){
		Ex4Arrays ex4=new Ex4Arrays();

		double[]prices={12.50,11.20,3,4,5,6,7,8,9.0,12.9,6,3};
		double[]increase=new double [prices.length];
		ex4.makeNewPrices( prices,  increase);

	}

	public void makeNewPrices(double []prices , double []increase){
		System.out.println("The old prices are\n");
		for (int i=0; i < prices.length;i++) {
			System.out.println(prices[i]);
		}
		System.out.println("The new prices are\n");
		for (int i=0; i < prices.length;i++) {
			increase [i]= (prices[i]) +(0.04)*(prices[i]);
		}
		for (int i=0; i < prices.length;i++) {System.out.println(increase[i]);}
	}		
}

