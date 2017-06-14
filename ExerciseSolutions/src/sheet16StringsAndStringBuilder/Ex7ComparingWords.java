package sheet16StringsAndStringBuilder;
import java.util.Scanner;
public class Ex7ComparingWords {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Please select a word");
		String input = s.nextLine();
		System.out.println("The word you selected is " + input + ". Please select another word");
		String input1 = s.nextLine();
		System.out.println("The word you selected is " + input1);
		int result = input.compareTo(input1);
		if(result>0)
			System.out.println("The word " + input + " follows the word " + input1);
		else if(result==0)
			System.out.println("The word " + input + " is the same as the word " + input1);
		else 
			System.out.println("The word " + input + " precedes the word " + input1);
	
		s.close();
	}

}
