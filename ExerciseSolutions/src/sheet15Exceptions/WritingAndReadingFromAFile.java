package sheet15Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class WritingAndReadingFromAFile {

	public static void main(String[] args) {
		String filename = "src/sheet15Exceptions/Thursday.txt";
		try{// must have curly brackets, there must be a catcher after
		
		PrintWriter pw = new PrintWriter(filename);//e is the convention in java
		pw.println("Hello");//prints only if there is no exception
		pw.println("have a cookie Cookie");
		pw.println("bla");
		pw.println("bla bla bla");
		pw.println("bla bla bla");
	//	pw.flush();
		pw.close();
		} catch (FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "File not found");
			e.printStackTrace();
		}// this line will execute regardless 
		
		try{
			System.out.println("Contents of the file ....");
		// a try must have curly brackets, a catch or  a finally block must follow a try block, if you call a method that might throw a checked 
			//exception you must handle it either by placing a try catch block around your code or declaring that the method might throw those exceptions
			// 	public static void main(String[] args) throws FileNotFindException, IOException{...}
			// an exception here is thrown out of main 
			
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			String line ="";
		while ((line= br.readLine() )!= null)
		{System.out.println(line);}
		br.close();
		
	
		}catch(FileNotFoundException e){//thrown from creating a file reader object if the file cannot be found
			JOptionPane.showMessageDialog(null, "File does not exist");
			e.printStackTrace();	
		}
		//IOException of all exceptions, this will catch any unchecked exceptions: array out of bounds 
		catch(IOException e){//might be thrown from br.readLine if there is a problem reading from the file, file disappears while reading
			JOptionPane.showMessageDialog(null, "Error reading from file");
			e.printStackTrace();
			
		}
		finally{System.out.println("\nwill always execute");}//will always execute
		//only one will execute when an exception occurs - the first matching one
				
				System.out.println("end of main");
		
	}

}
