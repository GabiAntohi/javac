package sheet3ControlFlow;
import java.util.Scanner;
public class Ex7Loops{
	public static void main(String [] args){
		int i=0;
		int total=0;
		int a =0;


		Scanner input = new Scanner(System.in);
		do{  
			System.out.println("Enter an integer: " );  
			a = input.nextInt();
			total=a+total;
			System.out.println("The total is " + total );
			i++;
		}while(i<10);
		System.out.println("The grand total is " + total );
		System.out.println("The average is " + ((double)total/i) );/*should have made it a double*/
		input.close();
	}


}
