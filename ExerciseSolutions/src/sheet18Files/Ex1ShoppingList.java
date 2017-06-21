package sheet18Files;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ex1ShoppingList {

	public static void main(String[] args) {

		String filename = "src/sheet18Files/List.txt";	
		try{	
			PrintWriter pw = new PrintWriter(filename);//e is the convention in java
			Scanner s = new Scanner(System.in);
			int counter=1;
			for(int i=0;i<counter; i++){
				System.out.println("Order "+ counter);
				System.out.println("Please select a product and price, write stop to exit");
				String product = s.nextLine();
				if(product.equals("stop")){
					System.exit(0);
				}
				else {
					counter++;
					pw.println("Product and price: "+ product);	
					pw.flush();
				}
			}
			pw.close();
			s.close();	


		}

		catch (FileNotFoundException e){
			System.out.println("File could not be created");
			e.printStackTrace();
		}


		try{
			System.out.println("Contents of the file ....");
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			String line ="";
			while ((line= br.readLine() )!= null)
			{System.out.println(line);}

			br.close();
		}

		catch(FileNotFoundException e){//thrown from creating a file reader object if the file cannot be found
			System.out.println("File does not exist");
			e.printStackTrace();	
		}
		//IOException of all exceptions, this will catch any unchecked exceptions: array out of bounds 
		catch(IOException e){//might be thrown from br.readLine if there is a problem reading from the file, file disappears while reading
			System.out.println("Error reading from file");
			e.printStackTrace();
		}

		//finally{System.out.println("thx for shopping with us");}

	}

}
