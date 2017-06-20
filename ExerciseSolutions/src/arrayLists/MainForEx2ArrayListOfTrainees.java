package arrayLists;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
//import java.util.Iterator;
import java.time.format.DateTimeFormatter;
public class MainForEx2ArrayListOfTrainees {

	public static void main(String[] args) {
		Ex2ArrayListOfTrainees t = new Ex2ArrayListOfTrainees("John", "Kildare st, Dublin 2",
				LocalDate.of(1988, Month.FEBRUARY, 2));
		System.out.println(t);
		System.out.println("----------------");

		Ex2ArrayListOfTrainees t1 = new Ex2ArrayListOfTrainees("Eddy", "Phillys st, Dublin 6",
				LocalDate.of(1988, Month.AUGUST, 11));
		System.out.println(t1);
		System.out.println("----------------");

		Ex2ArrayListOfTrainees t2 = new Ex2ArrayListOfTrainees("Mark", "Milton, Dublin 7",
				LocalDate.of(1988, Month.JULY, 9));
		System.out.println(t2);
		System.out.println("----------------");

		Ex2ArrayListOfTrainees t3 = new Ex2ArrayListOfTrainees("Steve", "Made Up st, Dublin 8",
				LocalDate.of(1988, Month.MARCH, 8));
		System.out.println(t3);
		System.out.println("----------------");

		Ex2ArrayListOfTrainees t4 = new Ex2ArrayListOfTrainees("Dwayne", "Spain st, Dublin 9",
				LocalDate.of(1988, Month.JUNE, 10));
		System.out.println(t4);
		System.out.println("----------------");

		Ex2ArrayListOfTrainees tcopy = new Ex2ArrayListOfTrainees("John", "Kildare st, Dublin 2",
				LocalDate.of(1988, Month.FEBRUARY, 2));
		System.out.println(tcopy);
		System.out.println("----------------");
		System.out.println("----------------");

		ArrayList<Ex2ArrayListOfTrainees> traineeList = new ArrayList<>();
		traineeList.add(t);
		traineeList.add(t1);
		traineeList.add(t2);
		traineeList.add(t3);
		traineeList.add(t4);
		System.out.println(traineeList);
		System.out.println(traineeList.contains(tcopy));//false need to override .equals();
		System.out.println("----------");
		t1.setAddress("***********");
		System.out.println(traineeList);
		Scanner s = new Scanner (System.in);
		System.out.println("Please guess a name");
		String input = s.nextLine();
		boolean isFound = false;
		for(Ex2ArrayListOfTrainees o:traineeList){
			if(input.equals(o.getName())){ 
				DateTimeFormatter formatter =
		             DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.println(o.getDateOfBirth().format(formatter));	
				isFound=true;
			}
		}
		if(!isFound){System.out.println( input + " is not valid, try another name.");}

		System.out.println("Choose a trainee to remove");

		String input1 = s.nextLine();
		isFound = false;
		for(int i=0; i<traineeList.size(); i++){
			if((traineeList.get(i).getName().equals(input1))){	
				System.out.println(traineeList.remove(traineeList.get(i)));	
				System.out.println(traineeList);
				isFound=true;
				}
		}
		if(!isFound){System.out.println( input1 + " is not valid, try another name.");}


		/*Iterator<Ex2ArrayListOfTrainees> iterator = traineeList.iterator();

		        System.out.println("Printing list without one trainee:" );
		        // iterator.hasNext(): asks if there is a next element in the list?
		        while(iterator.hasNext()) { 
		        	Ex2ArrayListOfTrainees currentTrainee = iterator.next(); // Get that element
		        	if(input.equals(currentTrainee.getName()))
		            System.out.println(traineeList.remove(traineeList.get(currentTrainee)));
		          System.out.println(traineeList);
		            iterator.remove(); // Remove current element
		        } COULD NOT GET IT TO WORK */
		s.close();
	}

}




