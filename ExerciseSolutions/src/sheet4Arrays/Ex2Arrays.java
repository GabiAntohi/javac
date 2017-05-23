package sheet4Arrays;

import java.util.Scanner;

public class Ex2Arrays{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int i=0;
		double total=0;	
		double average=0;


		double[] nums = new double [10];

		for (;i<nums.length; i++){
			
			System.out.print("Please enter a double ");
			double num = input.nextDouble(); 
			System.out.println("The number you entered is " + num);
			nums[i] = num;
			total=total+num;
			average = total/(i+1);
			
		}
	
		for (;i<nums.length; i++)
			System.out.println(nums [i]);
	
		System.out.println( " this is the total " + total + " this is the average "+ average);
		input.close();
	}

}



