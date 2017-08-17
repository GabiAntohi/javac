package random;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* variable names cannot  start with a number, 
 * can have _, 
 * can have currency symbols:$.. 
 * no spaces 
 */
		int length = 1_234_567;
		double price = 12.33;
		/*underscores cannot stand on the edges of the literal
		 * can go in between numbers 
		 * not next to a dot */
		int binary = 0b100;
		
		
		//ternary operator
		double x = 60;
		//double profit = (80<=x&&x<=90)?(profit = 0.2):(profit = 0.5);
		
		
		//double profit =(80<=x&&x<=90)?(profit = 0.2):(x>90)?(profit = 0.5):(profit = 0);
		double profit =(80<=x&&x<=90)? 0.2:(x>90)? 0.5: 0;
		System.out.println(profit);
		
	}

}
