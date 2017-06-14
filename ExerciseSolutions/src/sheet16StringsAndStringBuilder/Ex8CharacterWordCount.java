package sheet16StringsAndStringBuilder;
import java.util.Scanner;
public class Ex8CharacterWordCount {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Please write a sentence");
		String input = s.nextLine();
		System.out.println("The sentence you wrote is: " + input);
		System.out.println("------------------");
	//	for(int i=0;i<letters.length; i++)
	//	System.out.println("Characters with spaces: " + letters[i] + (i + 1));
	//	System.out.println("Characters with spaces " + input.length());
		String [] words = input.split(" ");
		System.out.println("Number of words: " + words.length);
		System.out.println("------------------");
		char[] letter = input.toCharArray();
		 System.out.println("Characters with spaces: " + letter.length + "  ");
		 System.out.println("------------------");
		 int spaces = input == null ? 0 : input.length() - input.replace(" ", "").length();
		 System.out.println("Number of spaces: "+spaces);
		 System.out.println("------------------");
		 System.out.println("Number of characters without spaces: " + (input.length()-spaces));
		s.close();
	}

}
