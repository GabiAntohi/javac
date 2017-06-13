package sheet16StringsAndStringBuilder;
import java.util.Scanner;
public class Ex5LetterSearch {

	public static void main(String[] args) {
	//first way	but using the second as well
		
		
	/*	Scanner s = new Scanner (System.in);
		for(int a=0; a<3; a++){
		System.out.println("Enter a word");
		String input = s.nextLine();
		System.out.println("Enter a search character");
		String input2 = s.nextLine();
		System.out.println("The letter you wrote is: " + input2);
		int position = input.indexOf(input2);
		char[] letters = input.toCharArray();
	    for(int i = 0; i<1; i++)
	    	if(position==(input.indexOf(input2))&&position>=0)
		//  System.out.print(letters[i]);
		System.out.println("The letter " + letters[i] + " is at position " + position);
	    	else System.out.println(input2 + " was not found");
		}
		
	    s.close();*/
	//second way?	
		Scanner s = new Scanner (System.in);
		for(int a=0; a<3; a++){
		System.out.println("Enter a word");
		String input = s.nextLine();
		System.out.println("Enter a search character");
		String input2 = s.nextLine();
		System.out.println("The letter you wrote is: " + input2);
	   
		if (input.indexOf(input2)!=-1)
			for(int b=0; b<1; b++)
			{ 
			
			int position = input.indexOf(input2);
		 while(position>=0){
		System.out.println("the letter " + input2 + " can be found at position " + position);
		   position=input.indexOf(input2, position+1);
		   }
	    }
	    else
	    {
	       System.out.println("there is no " + input2 + " in " + input);
	    }
	    }
	    s.close();
	}

}
