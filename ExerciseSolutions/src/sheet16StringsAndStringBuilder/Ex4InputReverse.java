package sheet16StringsAndStringBuilder;
import java.util.Scanner;
public class Ex4InputReverse {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner (System.in);
		System.out.println("Input a String");
		String input = s.nextLine();
		
		StringBuilder sb=new StringBuilder(input);  
		sb.reverse();  
		System.out.println(sb);
		
	    char[] letters = input.toCharArray();
	    for(int counter=letters.length - 1; counter >= 0;counter--)
	    System.out.print(letters[counter]);
	    
	    s.close();

	}

}
