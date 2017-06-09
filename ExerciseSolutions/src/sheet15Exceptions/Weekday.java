package sheet15Exceptions;

public class Weekday {
private String weekday;
public static final String MONDAY = "Monday";
public static final String TUESDAY = "Tuesday";
public static final String WEDNESDAY = "Wednesday";
public static final String THURSDAY = "Thursday";
public static final String  FRIDAY = "Friday";

public Weekday() {

}

public Weekday(String weekday)throws InvalidWeekdayException {
	this();
	setWeekday(weekday);
}

public String getWeekday() {
	return weekday;
}

public void setWeekday(String weekday) throws InvalidWeekdayException{
	if(weekday.equalsIgnoreCase(MONDAY)||weekday.equalsIgnoreCase(TUESDAY)||weekday.equalsIgnoreCase(WEDNESDAY)||weekday.equalsIgnoreCase(THURSDAY)||weekday.equalsIgnoreCase(FRIDAY))
	this.weekday = weekday;
	else 
		throw new InvalidWeekdayException(weekday + " is not a weekday");
}

@Override
public String toString() {
	return "Weekday: " + weekday;
}

}
