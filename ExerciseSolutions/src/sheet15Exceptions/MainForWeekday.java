package sheet15Exceptions;

public class MainForWeekday {

	public static void main(String[] args) {

		Weekday day;

		try {
			day=new Weekday(Weekday.WEDNESDAY);
			System.out.println(day.getWeekday());
		}catch(InvalidWeekdayException e){
			System.out.println("Invalid weekday "+ e.getMessage()); 
			e.printStackTrace();}

		Weekday day2;

		try {
			day2=new Weekday("dds");
			System.out.println(day2);
		}catch(InvalidWeekdayException e){
			System.out.println("Invalid weekday "+ e.getMessage()); 
			e.printStackTrace();}


		Weekday day3;

		try {
			day3=new Weekday("Monday");
			System.out.println(day3);
		}catch(InvalidWeekdayException e){
			System.out.println("Invalid weekday "+ e.getMessage()); 
			e.printStackTrace();}
		
		Weekday day4;
		try {
			day4=new Weekday("thursday");
			System.out.println(day4);
		}catch(InvalidWeekdayException e){
			System.out.println("Invalid weekday "+ e.getMessage()); 
			e.printStackTrace();}

		finally{System.out.println("\nIn the finally block");}
	}
}