package sheet4Arrays;

import java.util.Arrays;

public class Ex5ClassNames {

	public static void main(String[] args) {
		int i=0;
		String []firstNames={"Emmanuel ", "Gabriela ", "Vitalie ", "Kevin ", "Ben ", "Ewelina ", "Asen ", "Pat ", "Stephen ", "James ", "Agnes ", "Shane ", "Sean ", "Jay ", "Darius ", "Damien ", "Luca ", "Janos "};
		String []lastNames={"Em", "Gab", "Vi", "Kev", "B", "Ew", "A", "Pt", "St", "Ja", "Ag", "Sh", "Se", "J", "Da", "Da", "Luc", "Ja"};

		for (i=0; i < firstNames.length;i++) {
			System.out.println("first Names  "+ (i+1) + "\t" + firstNames[i] );
		}
		for (i=0; i < lastNames.length;i++){
			System.out.println("last Names  "+ (i+1) + "\t" +  lastNames[i]);
		}


		String[]fullNames=new String [firstNames.length];
		for (i=0;i<fullNames.length; i++){
			fullNames[i] = firstNames[i]+lastNames[i]; 
			System.out.printf("\nFull Names:   %-3d %s ",  (i+1) , fullNames[i]);
		}
		Arrays.sort(fullNames);
		 for (String name : fullNames) {
	            System.out.println(name);
	        }
	}

}
