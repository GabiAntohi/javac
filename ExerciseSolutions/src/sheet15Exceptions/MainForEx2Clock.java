package sheet15Exceptions;



public class MainForEx2Clock {

	public static void main(String[] args) {
		Ex2Clock clock;
		try {
			clock=new Ex2Clock(45, 59, 59);
			System.out.println(clock);
		}catch(InvalidTimeException e){
			System.out.println("Invalid time "); 
		e.printStackTrace();}
		
		Ex2Clock clock2;
		try {
			clock2=new Ex2Clock(10, 106, 59);
			System.out.println(clock2);
		}catch(InvalidTimeException e){
			System.out.println("Invalid time " + e.getMessage()); 
		e.printStackTrace();}
		
		finally{System.out.println("\nIn the finally block");}
	}

}

