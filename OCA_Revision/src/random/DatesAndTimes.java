package random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DatesAndTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LocalDate date1 = LocalDate.now();//static method 
   
   System.out.println(" local date prints: "+ date1);
   
   LocalTime time1 = LocalTime.now();
   System.out.println(" local time prints: "+ time1);
   
   LocalDateTime dateTime = LocalDateTime.now();
   System.out.println(" local date and time prints: "+ dateTime);
   
   LocalDate myBirthday = LocalDate.of(1984, 2, 10);
   LocalDate myBirthday2 = LocalDate.of(1984, Month.FEBRUARY, 10);
   System.out.println(" my birthday prints: "+ myBirthday2);
   
   LocalTime fff = LocalTime.of(11, 52, 23);
   System.out.println(" random time prints: "+ fff);
   
   LocalDateTime ff = LocalDateTime.of(myBirthday, time1);
   System.out.println(" random time prints: "+ ff);
   
   LocalDateTime midnightNYE = LocalDateTime.of(2017, Month.DECEMBER, 31, 23, 59);//immutable
   midnightNYE.plusMinutes(1);
   midnightNYE = midnightNYE.plusMinutes(1);
   System.out.println(" NY prints: "+ midnightNYE);

   midnightNYE = midnightNYE.plusHours(5).plusMinutes(1);
   System.out.println(" NY prints: "+ midnightNYE);
   
   
   
   LocalDate today = LocalDate.now();
   today = today.plusMonths(5);
   today = today.plus(3, ChronoUnit.MONTHS);
   System.out.println(" prints: "+ today);
   
   
   //exercise
   LocalDate firstDate = LocalDate.of(2018, 1, 1);
   LocalTime firstTime = LocalTime.of(9, 0);
   LocalDateTime firstDateTime = LocalDateTime.of(firstDate, firstTime);
   firstDateTime = firstDateTime.plusYears(-5000).plusMonths(2).minusHours(1);//don't forget to reassign
   System.out.println("date changes prints: "+ firstDateTime);
  // firstTime = firstTime.plus(1, ChronoUnit.MONTHS);//exception - unsupportedTemporalTypeException
   
   
   Period ofYears = Period.ofYears(10);
   Period ofDays= Period.ofDays(6);
   Period ofMonths= Period.ofMonths(6);
   Period ofWeeks= Period.ofWeeks(6);
   Period ofYearsMonthsDays = Period.of(2, 1, 5); //years, months, days
   
   
	
   Period ofTime = Period.ofDays(4);
   Period ofTime1 = Period.ofWeeks(18);
   
   LocalDate d4 = LocalDate.now();
   
   d4 = d4.plus(ofTime);
   d4 = d4.plus(ofTime1);
   System.out.println("you get "   + d4);
   
   
   
   LocalDate christmas = LocalDate.of(2017,12,25);
   System.out.println(christmas.until(LocalDate.now()));
   
   
   Period ofTime2 = Period.of(1, 2, 3);
   System.out.println("you get "   + ofTime2);//you get P1Y2M3D
   
   Period wrong = Period.ofYears(2).ofWeeks(3).ofDays(4);//only the ofDays will work
		   System.out.println("you get "   + wrong);    //P4D, because they are static they have to be done one by one
		   //don't chain static methods
   Period right = Period.ofYears(2);
   right = right.plusDays(4);
   right = right.plus(Period.ofWeeks(4));	 
   System.out.println("you get "   + right); //you get P2Y32D
   
   
   Period sameAs = Period.ofYears(2).plus(Period.ofWeeks(4)).plus(Period.ofDays(4));
   System.out.println("you get "   + sameAs);//you get P2Y32D
   
   
	}

}
