package arrayLists;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class Ex1ArrayListOfStrings {

	public static void main(String[] args) {
		String s1 = "Agnes";
		String s2 = "Gaby";
		String s3 = "Emmanuel";
		String s4 = "Stephen";
		String s5 = "James";
		String s6 = "Damien";
		String s7 = "Janos";
		String s8 = "Sandra";	
		String s9 = "Pat";	
		String s10 = "Ben";
		String s11 = "Evelina";
		String s12 = "Asen";
		String s13 = "Jay";
		String s14 = "Vitalie";
		String s15 = "Kevin";

		ArrayList<String> strList = new ArrayList<>();
		String[] strings = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15};
		strList.addAll(Arrays.asList(strings));
		System.out.println(strList);

		Scanner s = new Scanner (System.in);
		System.out.println("Please guess a name");
		String input = s.nextLine();
		System.out.println(strList.contains(input));
		if (strList.contains(input)==true) System.out.println("Position: " + strList.indexOf(input));
		else System.out.println("Not on the list.");
		System.out.println("Write a name to be removed from the list. ");
		String input1 = s.nextLine();
		System.out.println(strList.remove(input1));
		System.out.println("The name you wrote is: "+ input1 + " and the list is now: " + strList);
		System.out.println("Choose a name to change on the list");
		String input2 = s.nextLine();
		System.out.println("Choose name to change it to");
		String input3 = s.nextLine();
		//indexOf - not in strList
		int a= strList.indexOf(input2);
		System.out.println(strList.set(a , input3));
		System.out.println("You chose to change " + input2 + " with " + input3 + "\nThe new list is " + strList);
		System.out.println("No. of people on the list: " + strList.size());
		Collections.sort(strList);
		System.out.println("Names sorted alphabetically: " + strList);
		System.out.println("I am about to remove " + strList.get(7));
		System.out.println(strList.remove(7));
		System.out.println("Santa"+strList);//outside the list
		strList.add(0, "Santa");
		System.out.println("New List "+strList);
		System.out.println(strList.size() == 0 ? "Empty" : "Not empty" ); // Empty
		strList.clear();
		System.out.println(strList);
		System.out.println(strList.isEmpty() ? "Empty" : "Not empty"); // Empty
		s.close();
	}


}


