package sheet15Exceptions;

public class Ex2Clock {
	private int hours;
	private int seconds;
	private int minutes;
	
	public Ex2Clock() {//constructors
		hours = 0;
		seconds = 0;
		minutes = 0;

	} 
	public Ex2Clock(int hours, int minutes, int seconds) throws InvalidTimeException{
		this();
		if (hours>23||hours<=0)
			throw new InvalidTimeException("invalid hour " + hours);
		else
		setHours(hours);
		if (minutes>=60||minutes<=0)
			throw new InvalidTimeException("invalid minutes " + minutes);
		else
		setMinutes(minutes);
		if (seconds>=60||seconds<=0)
			throw new InvalidTimeException("invalid seconds " + seconds);
		else
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
	if(hours>23)hours=hours%24;
	}
    public void incrementMinutes(int mIncrement){
    	minutes+=mIncrement;
    	if(minutes>59)
    	incrementHours(minutes/60);
    	minutes=minutes%60;
    	
    	}
    public void incrementSeconds(int sIncrement){
    	seconds+=sIncrement;
    	if(seconds>59)
    	incrementMinutes (seconds/60);
    	seconds=seconds%60;
    	
    	}
    public void reset(){
    	hours = 0;
		seconds = 0;
		minutes = 0;
    	}
 
    
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
				
				
	}
	
	
	}