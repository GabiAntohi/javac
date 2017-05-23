package sheet3ControlFlow;
import java.util.Scanner;
public class Ex8Loops{
	public static void main(String [] args){
		int i=0;
		int total=0;
		int a = 0;


		Scanner input = new Scanner(System.in);


		do{  
			System.out.println("Enter an integer: " );  
			a = input.nextInt();
			total=a+total;
			i++;
		}while(a!=-1);
		/*finished */

		/*System.out.println("The total is: " +(total+1));  total*/
		System.out.println("The average is: " +(total+1)/(i-1));/*average*/
		input.close();
	}
}
