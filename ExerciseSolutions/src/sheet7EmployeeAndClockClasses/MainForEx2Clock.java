package sheet7EmployeeAndClockClasses;

public class MainForEx2Clock {

	public static void main(String[] args) {
		Ex2Clock clock = new Ex2Clock(11, 59, 59);
		System.out.println(clock);  
		clock.incrementHours(1);
		System.out.println(clock);
		clock.incrementMinutes(1);
		System.out.println(clock); 
		clock.incrementSeconds(50);
		System.out.println(clock); 
		clock.reset();
		System.out.println(clock);

	}

}
