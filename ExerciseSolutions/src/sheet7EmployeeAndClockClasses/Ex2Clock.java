package sheet7EmployeeAndClockClasses;

public class Ex2Clock {
	private int hours;
	private int seconds;
	private int minutes;
	
	public Ex2Clock() {//constructors
		hours = 0;
		seconds = 0;
		minutes = 0;

	} 
	public Ex2Clock(int hours, int minutes, int seconds){
		this();
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if (hours>=0&&hours<=24)
		this.hours = hours;
		else {System.out.println("invalid no. of hours");}
	}
	public int getSeconds() {
	
		return seconds;
	}
	public void setSeconds(int seconds) {
		if (seconds>=0&&seconds<60)
		this.seconds = seconds;
		else {System.out.println("invalid no. of seconds");}
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if (minutes>=0&&minutes<60)
		this.minutes = minutes;
		else {System.out.println("invalid no. of minutes");}
	
	}
    public void incrementHours(int hIncrement){	
	hours+=hIncrement;
	if(hours>24)hours=hours%24;
	}
    public void incrementMinutes(int mIncrement){
    	minutes+=mIncrement;
    	if(minutes>59)hours+=1;
    	minutes=minutes%60;
    	}
    public void incrementSeconds(int sIncrement){
    	seconds+=sIncrement;
    	if(seconds>59)minutes+=1;
    	seconds=seconds%60;
    	}
    public void reset(){
    	hours = 0;
		seconds = 0;
		minutes = 0;
    	}
 
    
	@Override
	public String toString() {
		return String.format("time: \n%02d:%02d:%02d", hours, minutes, seconds);
				
				
	}
	
	
	}

