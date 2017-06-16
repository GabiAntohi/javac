package sheet16StringsAndStringBuilder;
import java.util.Scanner;
public class Ex6RandomWords {

	public static void main(String[] args) {
		int wrongGuessCounter=0;
		String [] words = {"catwoman", "barkingmad", "character", "milktray", "papertowel", "aftermath", "manyhappenings", "summertime", "uncannystory", "masterchef"};
		Scanner s = new Scanner (System.in);
		System.out.println("I will randomly select a word");

		int randomNumber = (int)(Math.random()*10);
		String word = words[randomNumber];
		int length = word.length( );
		System.out.println("There are " + length +  " characters in this word." );		
		//needs to go back here if the letter is not found
		while(wrongGuessCounter<8){
			System.out.println("Enter a letter");
			String input = s.nextLine();
			System.out.println("The character you entered is: " + input);
			if (word.indexOf(input)!=-1)	
			{ 
				int position = word.indexOf(input);
				while(position>=0){
					System.out.println("the letter " + input + " can be found at position " + position);
					position=word.indexOf(input, position+1);
				}
			}
			else
			{
				System.out.println("There is no " + input + " in this word ");
				wrongGuessCounter++; 
				System.out.println("counter: " + wrongGuessCounter);
			}
		}

		s.close();
	}


}







