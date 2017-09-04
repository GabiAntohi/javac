package random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dateNow = LocalDate.now();
		DateTimeFormatter dtfShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter dtfMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtfLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		   System.out.println(dtfShort.format(dateNow));
		   System.out.println(dateNow.format(dtfShort));
		   
		   System.out.println(dtfMedium.format(dateNow));
		   System.out.println(dateNow.format(dtfLong));
		   
		   
		   LocalTime timeNow = LocalTime.now();
		   DateTimeFormatter dtfS = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		   System.out.println(dtfS.format(timeNow));
		   System.out.println(timeNow.format(dtfS));
		   
		   
		   DateTimeFormatter dtfM = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		   System.out.println(dtfM.format(timeNow));
		   
		   
		   //throws exception at runtime java.time.DateTimeException, cannot format a time with long or full
		   //DateTimeFormatter dtfL = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
		  // System.out.println(dtfL.format(timeNow));
		   
		   LocalDateTime myParty = LocalDateTime.of(2017, 12, 24, 5, 8);
		   DateTimeFormatter dtfMyParty = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT);
		   System.out.println(dtfMyParty.format(myParty));
		   
		   
		   DateTimeFormatter dtfMyPattern = DateTimeFormatter.ofPattern("dd/MM/uu **&&** hh/mm/ss");
		   System.out.println(myParty.format(dtfMyPattern));
		   
		  
		   DateTimeFormatter dtfMySecondPattern = DateTimeFormatter.ofPattern("EEEE MMMM d.  **&&** h:mm a");
		   System.out.println(LocalDateTime.now().format(dtfMySecondPattern));
		   
		   //parsing
		   
		   String strDate = "12/01/17";
		   DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		   LocalDate date2 = LocalDate.parse(strDate, formatter);
		   System.out.println(date2);
		   
		   
		   String strTime = "16:04:22";
		   String strDateTime = "10 November 2017 22:59";
		   
		   fly(3);
		 
	
	}
	//  public static  void fly(int numMiles){ System.out.println("primitive");}
	  public static  void fly(Integer numMiles){System.out.println("wrapper");}
}
