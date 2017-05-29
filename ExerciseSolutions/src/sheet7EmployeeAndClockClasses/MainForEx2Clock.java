package sheet7EmployeeAndClockClasses;

public class MainForEx2Clock {

	public static void main(String[] args) {
		Ex2Clock clock = new Ex2Clock(10, 59, 59);
		System.out.println("starting time: " + clock);  
		clock.incrementHours(5);
		System.out.println("after incrementing the hours: " + clock);
		clock.incrementMinutes(20);
		System.out.println("after incrementing the minutes: " + clock); 
		clock.incrementSeconds(30);
		System.out.println("after incrementing the seconds: " +clock); 
		clock.reset();
		System.out.println("reset: " +clock);

	}

}
