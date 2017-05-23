package sheet4ATwoDimensionalArrays;
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ex2NamesAndAddresses {

	public static void main(String[] args) {
		String[][]namesAddress = {{"John","45 kildare St.,","Finglas,", "Dublin 11"},{"Paul", "35 NCR"}, {"Eddy","2 Park Avenue,","Blanchardstown,", "Dublin 15"},{ "Victor", "2nd Ave,","Dublin 12"}};
		int j = 0;
		int i = 0;

		for(  i=0; i<namesAddress[i].length; i++){	
			for( j=0; j<namesAddress[i].length; j++){
				System.out.print( namesAddress[i][j] +" " );
			}
			System.out.println();
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a name to get the address: ");
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("The address is: ");
		for( i=0; i<namesAddress.length; i++){
			for( j=1; j<namesAddress[i].length; j++){
				if (namesAddress[i][0].equals(name))
				{System.out.print(namesAddress[i][j] + " ");}


			}


		}

	}

}








