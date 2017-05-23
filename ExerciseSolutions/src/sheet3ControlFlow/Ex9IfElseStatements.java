package sheet3ControlFlow;
import java.util.Scanner;
public class Ex9IfElseStatements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//while(true){
		System.out.println("Please enter an integer ");
		int num=scanner.nextInt();
		System.out.println("You entered " + num);
		//short circuit - when it finds faults on the left won't look at right
		if(num>=1&&num<=10)
			System.out.println("You typed 1 to 10 ");
		else if (num>=11 && num<=20)
			System.out.println("You typed 11 to 20 ");
		else if (num>=21 && num<=30)
			System.out.println("You typed 21 to 30 ");
		else if (num>=31 && num<=40)
			System.out.println("You typed 31 to 40 ");
		else if (num>=41 && num<=50)
			System.out.println("You typed 41 to 50 ");
		else 
			System.out.println("You typed over 50 ");
		//	}
		scanner.close();
	}

}
