package sheet3ControlFlow;
import java.util.Scanner;

public class Ex6Loops{
    public static void main(String [] args){
	
	Ex6Loops ex6 = new Ex6Loops();
    Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: " );  
	   int a = input.nextInt();
	   System.out.print("Total: " + a);    
	   
	System.out.print("\nEnter a second integer: " );  
	   int b = input.nextInt();
	   
	System.out.print("Total: " + (a+b));   
	System.out.print("\nEnter a third integer: " );  
	   int c = input.nextInt();	   
	   
	   int total = ex6.getTotal(a, b, c);
	System.out.println("The total is " + total);
	  input.close();
	}
	public int getTotal(int a, int b, int c){
			int total;
			total = a+b+c;
		   return total;
		
			}	 
	}